function myFunction() {
    alert("sssss")
}
function mytime() {
    var a = new Date();
    var b = a.toLocaleDateString();
    var c = a.toLocaleTimeString();
    document.getElementById("time").innerHTML = b+"&nbsp"+c;
}
setInterval(setInterval(function() {mytime()},1000));