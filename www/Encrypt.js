var exec = require('cordova/exec');

exports.getPublicKey = function (success, error) {
    exec(success, error, 'Encrypt', 'getPublicKey');
};
