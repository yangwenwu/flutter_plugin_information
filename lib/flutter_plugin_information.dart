import 'dart:async';

import 'package:flutter/services.dart';

class FlutterPluginInformation {
  static const MethodChannel _channel =
      const MethodChannel('flutter_plugin_information');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<String> get sdkInts async {
    final String version = await _channel.invokeMethod('getSDKINT');
    return version;
  }

  static Future<String> get boards async {
    final String version = await _channel.invokeMethod('getBoard');
    return version;
  }

  static Future<String> get brands async {
    final String version = await _channel.invokeMethod('getBrand');
    return version;
  }

  static Future<String> get model async {
    final String version = await _channel.invokeMethod('getModel');
    return version;
  }

  static Future<String> get cpuAbis async {
    final String version = await _channel.invokeMethod('getCPUABI');
    return version;
  }

}
