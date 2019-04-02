package com.lemon.flutter_plugin_information

import android.os.Build
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterPluginInformationPlugin: MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "flutter_plugin_information")
      channel.setMethodCallHandler(FlutterPluginInformationPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method.equals("getPlatformVersion")) {
//            result.success("Android " + android.os.Build.VERSION.RELEASE);
      result.success("Android release系统版本（字符串类型）：" + Build.VERSION.RELEASE)
    }
    else if(call.method.equals("getSDKINT")){
      result.success("Android API版本（int类型）：" + Build.VERSION.SDK_INT)
    }
    else if(call.method.equals("getBoard")){
      result.success("主板型号：" + android.os.Build.BOARD)
    }
    else if(call.method.equals("getBrand")){
      result.success("产品品牌（or系统制造商）：" + android.os.Build.BRAND)
    }
    else if(call.method.equals("getModel")){
      result.success("手机的型号/设备名称：" + android.os.Build.MODEL)
    }
    else if(call.method.equals("getCPUABI")){
      result.success("设备指令集名称（CPU的类型）：" + android.os.Build.CPU_ABI)
    }
    else {
      result.notImplemented()
    }
  }
}
