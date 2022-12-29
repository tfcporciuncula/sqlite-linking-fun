package com.fredporciuncula.sqlitelinking

import platform.UIKit.UIDevice
import cocoapods.Sentry

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()