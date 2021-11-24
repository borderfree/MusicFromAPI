//
//  DetailVC.swift
//  Study Music App
//
//  Created by Fetih Tunay on 16/05/21.
//  Copyright © Fetih Tunay. All rights reserved.
//

import UIKit

class DetailVC: UIViewController,UICollectionViewDelegate,UICollectionViewDataSource,UICollectionViewDelegateFlowLayout  {
    
    var numberOfItemsPerRow = 2
    
    @IBOutlet weak var headerLabel: UILabel!
    var selectedItemIndex : Int = 0
    @IBOutlet weak var menuCollectionView: UICollectionView!
    var selectedMenu : String!
    
    @IBOutlet weak var selectedCategoryImage: UIImageView!
    var menuArray : NSMutableArray = NSMutableArray()
    
    let cellId : String = "MenuCollectionViewCell"
   
    
    override func viewDidLoad() {
        super.viewDidLoad()
    
        menuCollectionView.delegate = self
        menuCollectionView.dataSource = self
        
        setupOrganizeForSelectedCell()
        headerLabel.text = selectedMenu
        fetchMenuArrayItems()
        
    }
    func collectionView(_ collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return menuArray.count
    }
    
    func collectionView(_ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath) -> UICollectionViewCell {
        
        let cell = collectionView.dequeueReusableCell(withReuseIdentifier: cellId as String, for: indexPath) as! MenuCollectionViewCell
        
        let dict  = menuArray[indexPath.row] as? NSDictionary
        cell.menuLabel.text = dict?.value(forKey: "name") as? String
        cell.backgroundColor = UIColor.getColorArrayWith(index:indexPath.row)
        cell.menuImageView.tintColor = UIColor.white
        cell.menuImageView.image = UIImage(named: dict?.value(forKey: "image") as? String ?? "")
        return cell
    }
    
    func collectionView(_ collectionView: UICollectionView, didSelectItemAt indexPath: IndexPath) {
        DispatchQueue.main.async {
            let vc = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "PlayVC") as! PlayVC
            vc.selectedIndexDict = self.menuArray.object(at: indexPath.row) as! NSDictionary
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
        return CGSize(width: size , height: size )
    }
    
    @IBAction func tapOnBackButton(_ sender: UIButton) {
        self.navigationController?.popViewController(animated: true)
    }
    
    fileprivate func setupOrganizeForSelectedCell(){
        switch selectedItemIndex {
        case 0:
            selectedMenu = "Up Tempo"
            selectedCategoryImage.image = UIImage(named: "1.uptempo")
        case 1:
            selectedMenu = "Power"
            self.selectedCategoryImage.image = UIImage(named: "2.power")
        case 2:
            selectedMenu = "Aerobics"
            self.selectedCategoryImage.image = UIImage(named: "3.aerobics")
        case 3:
            selectedMenu = "Energy"
            self.selectedCategoryImage.image =  UIImage(named: "4.energy")
        case 4:
            selectedMenu = "Cardio"
            self.selectedCategoryImage.image =  UIImage(named: "5.cardio")
        default:
            selectedMenu = "Cool Down"
            self.selectedCategoryImage.image = UIImage(named: "6.cooldown")
        }
    }
    fileprivate func fetchMenuArrayItems(){
        
        let path = Bundle.main.path(forResource: "generated", ofType: "json")
        do {
            let data = try Data(contentsOf: URL(fileURLWithPath: path ?? ""), options: .mappedIfSafe)
            let jsonResult = try JSONSerialization.jsonObject(with: data, options: .mutableLeaves)
            
            if let jsonResult = jsonResult as? Dictionary<String, AnyObject>, let menu = jsonResult[selectedMenu] as? [Any] {
                print(menu)
                menuArray.addObjects(from: menu)
                self.menuCollectionView.reloadData()
            }
        } catch {
            // handle error
        }
    }
}
