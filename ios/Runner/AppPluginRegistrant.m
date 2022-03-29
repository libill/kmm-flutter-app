//
//  AppPluginRegistrant.m
//  Runner
//
//  Created by libill on 2022/3/24.
//

#import "AppPluginRegistrant.h"

@implementation AppPluginRegistrant

+ (void)registerWithRegistry:(NSObject<FlutterPluginRegistry>*)registry {
  [PluginCodelabPlugin registerWithRegistrar:[registry registrarForPlugin:@"PluginCodelabPlugin"]];
}

@end
