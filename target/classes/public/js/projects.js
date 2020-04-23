function showDatalog() {
    if($("#dataDetail").css("display")=="none"){
        var dataDetail = document.getElementById("dataDetail");
        dataDetail.style.display = "block";
    }

    if($("#ALUDetail").css("display")!="none"){
        var aluDetail = document.getElementById("ALUDetail");
        aluDetail.style.display = "none";
    }

    if($("#RBTDetail").css("display")!="none"){
        var rbtDetail = document.getElementById("RBTDetail");
        rbtDetail.style.display = "none";
    }
}

function showALU() {
    if($("#dataDetail").css("display")!="none"){
        // console.log(fasd);
        var dataDetail = document.getElementById("dataDetail");
        dataDetail.style.display = "none";
        // console.log($("#dataDetail").css("display"));
    }

    if($("#ALUDetail").css("display")=="none"){
        var aluDetail = document.getElementById("ALUDetail");
        aluDetail.style.display = "block";
    }

    if($("#RBTDetail").css("display")!="none"){
        var rbtDetail = document.getElementById("RBTDetail");
        rbtDetail.style.display = "none";
    }
}

function showRBT() {
    if($("#dataDetail").css("display")!="none"){
        // console.log(fasd);
        var dataDetail = document.getElementById("dataDetail");
        dataDetail.style.display = "none";
        // console.log($("#dataDetail").css("display"));
    }

    if($("#ALUDetail").css("display")!="none"){
        var aluDetail = document.getElementById("ALUDetail");
        aluDetail.style.display = "none";
    }

    if($("#RBTDetail").css("display")=="none"){
        var rbtDetail = document.getElementById("RBTDetail");
        rbtDetail.style.display = "block";
    }
}

function delayURL(url,time) {
    setTimeout("top.location.href = '" + url + "'",time);
}

function detectPlag(){
    // console.log("yes!");
    var codeUrlList = new Array();
    var url = "/API/TF/allDetection";
    $.ajax({
        url: url,
        type: "POST",
        data: JSON.stringify({
            codeUrlList: codeUrlList
        }),
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        success: function(result){
            console.log("检测结果保存成功！");
            var jsondata = JSON.stringify(result.data);
            var jsonobj = eval("("+jsondata+")");
            // console.log("解析数据："+jsonobj);
            var plagNum = jsonobj.plagNum;
            console.log("plag:"+plagNum);
            document.getElementById("statistic-result").innerHTML = "改变内容了！"
            window.open("../tool/result.html");
        },
        error: function (err) {
            alert("检测出错!");

        }
        }

    )
}