//
//  ComposeView.swift
//  iosApp
//
//  Created by Manaswini Kundeti on 2024-01-17.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared
import SwiftUI

struct ComposeView : UIViewControllerRepresentable {
    func updateUIViewController(_ uiViewController : UIViewControllerType, context: Context) { }

    func makeUIViewController(context: Context) -> some UIViewController {
        return MainViewControllerKt.MainViewController()
    }
}