//
//  UIColor-Extension.swift
//  Fitness Exercise Running Music - Coaching
//
//  Created by Fetih Tunay on 30.08.21.
//  Copyright © Fetih Tunay. All rights reserved.
//

import Foundation
import UIKit

extension UIColor {
    
    class func getColorArrayWith(index : Int) -> UIColor {
        
        let colorArray : Array = [UIColor(red: 88.0/255.0, green: 24.0/255.0, blue: 69.0/255.0, alpha: 1.0),UIColor(red: 144.0/225.0, green: 12.0/255.0, blue: 63.0/255.0, alpha: 1.0),UIColor(red: 199.0/255.0, green: 0/255.0, blue: 63.0/255.0, alpha: 1.0),UIColor(red: 255.0/255.0, green: 87.0/255.0, blue: 51.0/255.0, alpha: 1.0),UIColor(red: 255.0/255.0, green: 195.0/255.0, blue: 5/255.0, alpha: 1.0),UIColor(red: 227.0/255.0, green: 80.0/255.0, blue: 57.0/255.0, alpha: 1.0),        UIColor(red: 251.0/255.0, green: 52.0/255.0, blue: 97.0/255.0, alpha: 1.0),UIColor(red: 144.0/255.0, green: 40.0/255.0, blue: 171.0/255.0, alpha: 1.0),UIColor(red: 96.0/255.0, green: 53.0/255.0, blue: 178.0/255.0, alpha: 1.0),UIColor(red: 63.0/255.0, green: 76.0/255.0, blue: 176.0/255.0, alpha: 1.0),UIColor(red: 67.0/255.0, green: 145.0/255.0, blue: 238.0/255.0, alpha: 1.0),UIColor(red: 68.0/255.0, green: 164.0/255.0, blue: 240.0/255.0, alpha: 1.0),UIColor(red: 78.0/255.0, green: 184.0/255.0, blue: 209.0/255.0, alpha: 1.0),UIColor(red: 60.0/255.0, green: 146.0/255.0, blue: 134.0/225.0, alpha: 1.0),UIColor(red: 99.0/255.0, green: 173.0/255.0, blue: 86.0/255.0, alpha: 1.0),UIColor(red: 149.0/255.0, green: 194.0/255.0, blue: 64.0/255.0, alpha: 1.0),UIColor(red: 207.0/255.0, green: 220.0/255.0, blue: 77.0/255.0, alpha: 1.0),UIColor(red: 252.0/255.0, green: 237.0/255.0, blue: 82.0/255.0, alpha: 1.0),UIColor(red: 246.0/255.0, green: 196.0/255.0, blue: 54.0/255.0, alpha: 1.0),UIColor(red: 241.0/255.0, green: 157.0/255.0, blue: 44.0/255.0, alpha: 1.0),UIColor(red: 238.0/255.0, green: 98.0/255.0, blue: 44.0/255.0, alpha: 1.0),UIColor(red: 115.0/255.0, green: 85.0/255.0, blue: 72.0/255.0, alpha: 1.0),UIColor(red: 157.0/255.0, green: 157.0/255.0, blue: 157.0/255.0, alpha: 1.0),UIColor(red: 98.0/255.0, green: 119.0/255.0, blue: 133.0/255.0, alpha: 1.0)]
        
        if index >= colorArray.count {
            let newIndex = index % colorArray.count
            return colorArray[newIndex]
        }
        return colorArray[index]
    }
    
}
