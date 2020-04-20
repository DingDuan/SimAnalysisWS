function exeData(num, type) {
    loadData(num);
    loadpage();
}
function loadpage() {
    var myPageCount = parseInt($(".PageCount").val());
    var myPageSize = parseInt($(".PageSize").val());
    var countindex = myPageCount % myPageSize > 0 ? (myPageCount / myPageSize) + 1 : (myPageCount / myPageSize);
    $(".countindex").val(countindex);

    $.jqPaginator('.pagination', {
        totalPages: parseInt($(".countindex").val()),
        visiblePages: parseInt($(".visiblePages").val()),
        currentPage: 1,
        first: '<li class="first"><a href="javascript:;">First</a></li>',
        prev: '<li class="prev"><a href="javascript:;"><i class="arrow arrow2"></i>Prev</a></li>',
        next: '<li class="next"><a href="javascript:;">Next<i class="arrow arrow3"></i></a></li>',
        last: '<li class="last"><a href="javascript:;">Last</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
            if (type == "change"&& num==2) {
                //num:当前页码
                //console.log(num);
                // console.log(type);
                // var src = document.getElementById("src-code");
                // // console.log(src_pre);
                // src.innerHTML = "" +
                //     "         Predicate(String name) {\n" +
                //     "            if (name == null) {\n" +
                //     "                throw new NullPointerException(\"Name cannot be null\");\n" +
                //     "            }\n" +
                //     "            this.name = name;\n" +
                //     "        }";
                exeData(num, type);
                page2();
            }else if(type == "change"&& num==1) {
                exeData(num, type);
                page1();
            }else{
                //这里放ajax请求，亲测有效
                //真实思路：首先获得num当前页码
                // $.ajax({
                //     type: "GET",
                //     url: "http://47.101.183.63:8089/api/v1/video/statistics/basic/5285890784414113572",
                //     success: function (data) {
                //         console.log(data);
                //     }
                // })
            }
        }
    });
}
$(function () {
    loadData(1);
    loadpage();
});

function testB(){
    //var current = sessionStorage.getItem("current");
    //console.log(current);
}

function page1() {
    var student = document.getElementsByClassName("correspond2");
    student[0].innerHTML = "";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "1";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "93";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu1.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "2";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "89";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu2.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "3";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "87";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu3.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "4";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "83";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu4.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "5";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "78";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu5.html'}\">detail</button>";
}

function page2() {
    var student = document.getElementsByClassName("correspond2");
    student[0].innerHTML = "";
    // console.log(student);
    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "6";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "83";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu1.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "7";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "82";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu2.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "8";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "82";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu3.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "9";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "80";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu4.html'}\">detail</button>";

    var trNode = student[0].insertRow();
    var tdNode = trNode.insertCell();
    tdNode.style.paddingLeft = "52px";
    tdNode.innerHTML = "<input name=\"selectFlag\" type=\"checkbox\">";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "10";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "79";
    var tdNode = trNode.insertCell();
    tdNode.style.textAlign = "center";
    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\" onclick=\"{location.href='code/RBT/Stu5.html'}\">detail</button>";

}