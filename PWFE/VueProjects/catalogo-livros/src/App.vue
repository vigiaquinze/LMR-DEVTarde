<template>
  <div id="app">
  <MyHeader/>
  <router-view />
  <MyFooter />
  </div>
  </template>
  
  <script>
  import MyHeader from './components/MyHeader.vue'
  
  import MyFooter from './components/MyFooter.vue'
  
  export default {
  components: {
  MyHeader,
  MyFooter
  }
  }
  </script>