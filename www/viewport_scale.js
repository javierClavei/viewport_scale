var exec = require('cordova/exec');
 exec(null, null, "CDViewportScale", "coolMethod", [null]);
exports.coolMethod = function(arg0, success, error) {
    exec(success, error, "CDViewportScale", "coolMethod", [arg0]);
};
