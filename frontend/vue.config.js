process.env.VUE_APP_VERSION = require('./package.json').version;

module.exports = {
  outputDir: 'build/dist/public',
  devServer: { proxy: 'http://localhost:8080' },
};
