<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" />
    <HelloWorld msg="Welcome to Your Vue.js App" />
    <button @click="getList">Test</button>
  </div>
</template>

<script>
// @ is an alias to /src
import { inject } from 'vue';
import HelloWorld from '@/components/HelloWorld.vue';

export default {
  name: 'Home',
  components: {
    HelloWorld,
  },
  setup() {
    const axios = inject('axios');

    const getList = async () => axios.get('api/test');

    return { getList };
  },
};
</script>
