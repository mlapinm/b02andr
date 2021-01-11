import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, Image } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.text}>5O1pen</Text>    
      <Image source={{uri: 'https://randomuser.me/api/portraits/men/1.jpg'}} style={styles.img} />
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    color: 'blue',
    fontSize: 30
  },
  img:{
    width:100,
    height:100,
    borderRadius: 100./2
  }
});
