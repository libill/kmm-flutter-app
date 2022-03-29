//
//  AppPluginRegistrant.h
//  Runner
//
//  Created by libill on 2022/3/24.
//

#ifndef AppPluginRegistrant_h
#define AppPluginRegistrant_h

#import <Flutter/Flutter.h>
#import "PluginCodelabPlugin.h"

NS_ASSUME_NONNULL_BEGIN

@interface AppPluginRegistrant : NSObject
+ (void)registerWithRegistry:(NSObject<FlutterPluginRegistry>*)registry;
@end

NS_ASSUME_NONNULL_END
#endif /* AppPluginRegistrant_h */
