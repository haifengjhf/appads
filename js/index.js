import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

import ToastExample from './ToastExample';
import { NativeEventEmitter, NativeModules } from 'react-native';


class HelloWorld extends React.Component {
  render() {
    ToastExample.show('Awesome', ToastExample.SHORT,(msg) => {
        console.log(msg);
      }
    );

    const eventEmitter = new NativeEventEmitter(NativeModules.ToastExample);
      eventEmitter.addListener('EventReminder', (event) => {
         console.log(event.eventProperty); // "someValue"
    });   

    return (
      <View style={styles.container}>
        <Text style={styles.hello}>Hello, World</Text>
      </View>
    );
  }
}

 

var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center'
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10
  }
});

AppRegistry.registerComponent(
  'MyReactNativeApp',
  () => HelloWorld
);