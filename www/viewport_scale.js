var exec = require('cordova/exec');
 exec(null, null, "ViewportScale", "coolMethod", [null]);
exports.coolMethod = function(arg0, success, error) {
    exec(success, error, "ViewportScale", "coolMethod", [arg0]);
};
