
//
//  PlayVC.swift
//  Study Music App
//
//  Created by Fetih Tunay on 16/05/21.
//  Copyright © Fetih Tunay. All rights reserved.
//

import UIKit
import AVFoundation

class PlayVC: UIViewController {
    
    var player:AVPlayer = AVPlayer()
    var playerItem:AVPlayerItem!
    var selectedIndexDict : NSDictionary = NSDictionary()
    
    @IBOutlet weak var categoryLabel: UILabel!
    @IBOutlet weak var categoryImage: UIImageView!
    @IBOutlet weak var playImageView: UIImageView!
    @IBOutlet weak var playSlider: UISlider!
    @IBOutlet weak var remainingTime: UILabel!
    @IBOutlet weak var startTimeLabel: UILabel!
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        
        self.categoryLabel.text = selectedIndexDict.value(forKey: "name") as? String
        self.categoryImage.image = UIImage(named: selectedIndexDict.value(forKey: "image") as? String ?? "")
        
        var image2 =  UIImage.init(named: "ic_play")
        image2 = image2?.withRenderingMode(.alwaysTemplate)
        self.playImageView.tintColor = UIColor.white
        self.playImageView.image  = image2
        
        let url = URL(string: selectedIndexDict.value(forKey: "soundUrl") as! String)
        let playerItem:AVPlayerItem = AVPlayerItem(url: url!)
        player = AVPlayer(playerItem: playerItem)
        
        let playerLayer=AVPlayerLayer(player: player)
        playerLayer.frame=CGRect(x: 0, y: 0, width: 10, height: 50)
        self.view.layer.addSublayer(playerLayer)
        
        let duration : CMTime = playerItem.asset.duration
        let seconds : Float64 = CMTimeGetSeconds(duration)
        
        playSlider!.maximumValue = Float(seconds)
        playSlider!.isContinuous = false
        playSlider!.tintColor = UIColor.white
        
        player.addPeriodicTimeObserver(forInterval: CMTimeMakeWithSeconds(1, preferredTimescale: 1), queue: DispatchQueue.main) { (CMTime) -> Void in
            if self.player.currentItem?.status == .readyToPlay {
                let time : Float64 = CMTimeGetSeconds(self.player.currentTime());
                self.playSlider!.value = Float ( time );
                self.updateTime()
            }
        }
    }
    
    func getHoursMinutesSecondsFrom(seconds: Double) -> (hours: Int, minutes: Int, seconds: Int) {
        let secs = Int(seconds)
        let hours = secs / 3600
        let minutes = (secs % 3600) / 60
        let seconds = (secs % 3600) % 60
        return (hours, minutes, seconds)
    }
    
    func formatTimeFor(seconds: Double) -> String {
        let result = getHoursMinutesSecondsFrom(seconds: seconds)
        
        let hoursString = "\(result.hours)"
        var minutesString = "\(result.minutes)"
        if minutesString.count == 1 {
            minutesString = "0\(result.minutes)"
        }
        var secondsString = "\(result.seconds)"
        if secondsString.count == 1 {
            secondsString = "0\(result.seconds)"
        }
        var time = "\(hoursString):"
        if result.hours >= 1 {
            time.append("\(minutesString):\(secondsString)")
            return time
        }
        return "\(minutesString):\(secondsString)"
    }
    
    func updateTime() {
        
        guard let currentItem = self.player.currentItem else { return  }
        let playhead = currentItem.currentTime().seconds
        let duration = currentItem.duration.seconds
        self.startTimeLabel.text = formatTimeFor(seconds: playhead)
        self.remainingTime.text = formatTimeFor(seconds: duration)
    }
    
    @IBAction func progressSlider(_ sender: UISlider) {
        let seconds : Int64 = Int64(playSlider.value)
        let targetTime:CMTime = CMTimeMake(value: seconds, timescale: 1)
        player.seek(to: targetTime)
        if player.rate == 0{
            self.player.play()
        }
    }
    
    @IBAction func tapOnPlayPauseButton(_ sender: UIButton) {
        if self.player.rate == 0 {
            self.player.play()
            self.playImageView.image  = UIImage(named: "ic_pause")
            return
        }
        self.player.pause()
        self.playImageView.image  =  UIImage(named: "ic_play")
    }
    
    @IBAction func tapOnBackButton(_ sender: UIButton) {
        self.player.pause()
        self.navigationController?.popViewController(animated: true)
    }
    
}

