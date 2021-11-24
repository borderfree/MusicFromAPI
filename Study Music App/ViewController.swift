//
//  ViewController.swift
//  Study Music App
//
//  Created by Fetih Tunay on 16/05/21.
//  Copyright © Fetih Tunay. All rights reserved.
//

import UIKit

class ViewController:UIViewController {
   
    @IBOutlet weak var menuCollectionView: UICollectionView!
    
    var numberOfItemsPerRow = 2
    var menuArray : NSMutableArray = NSMutableArray()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        menuCollectionView.delegate = self
        menuCollectionView.dataSource = self
        fetchMenuArray()
    }
    
    func fetchMenuArray(){
        let path = Bundle.main.path(forResource: "generated", ofType: "json")
        do {
            let data = try Data(contentsOf: URL(fileURLWithPath: path ?? ""), options: .mappedIfSafe)
            let jsonResult = try JSONSerialization.jsonObject(with: data, options: .mutableLeaves)
            if let jsonResult = jsonResult as? Dictionary<String, AnyObject>, let menu = jsonResult["menu"] as? [Any] {
                print(menu)
                menuArray.addObjects(from: menu)
                self.menuCollectionView.reloadData()
            }
        } catch let err {
            print(err)
        }
    }
}

extension ViewController :UICollectionViewDelegate,UICollectionViewDataSource,UICollectionViewDelegateFlowLayout {
    
    
    func collectionView(_ collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return menuArray.count
    }
    
    func collectionView(_ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath) -> UICollectionViewCell {
        
        let cell = collectionView.dequeueReusableCell(withReuseIdentifier:"MenuCollectionViewCell", for: indexPath) as! MenuCollectionViewCell

        let dict = menuArray[indexPath.row] as? NSDictionary
        cell.menuLabel.text = (dict?.value(forKey: "name") as! String)
        cell.backgroundColor = UIColor.getColorArrayWith(index:indexPath.row)
        cell.menuImageView.image = UIImage.init(named: dict?.value(forKey: "image") as? String ?? "")
        return cell
    }
    
    func collectionView(_ collectionView: UICollectionView, didSelectItemAt indexPath: IndexPath) {
        DispatchQueue.main.async {
            let vc = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "DetailVC") as! DetailVC
            vc.selectedItemIndex = indexPath.row
            self.navigationController?.pushViewController(vc, animated: true)
        }
    }
    
    func collectionView(_ collectionView: UICollectionView, layout collectionViewLayout: UICollectionViewLayout, sizeForItemAt indexPath: IndexPath) -> CGSize {
        
        let flowLayout = collectionViewLayout as! UICollectionViewFlowLayout
        let totalSpace = flowLayout.sectionInset.left + flowLayout.sectionInset.right + (flowLayout.minimumInteritemSpacing * CGFloat(numberOfItemsPerRow - 1))
        let size = Int((collectionView.bounds.width - totalSpace) / CGFloat(numberOfItemsPerRow))
        
        if ( UI_USER_INTERFACE_IDIOM() == UIUserInterfaceIdiom.pad ){
            return CGSize(width: size , height: 200  )
        }
        return CGSize(width: size,height: size)
    }
}
