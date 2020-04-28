window.onload = getDetectRes;

function getDetectRes(){
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

                //展示上面概述
                var warningImg = document.createElement("img");
                warningImg.src = "../img/warning.png";
                var generalresult = document.getElementById("general-result");
                generalresult.appendChild(warningImg);
                generalresult.append("对项目"+jsonobj.subjectName+"，共检测"+jsonobj.allDetectionNum+"名学生的测试代码，其中"+jsonobj.plagNum+"名学生存在抄袭！");

                //展示左边表格
                var statisticResultList = jsonobj.statisticResultList;
                var table = document.getElementById("correspond");
                var page = document.getElementById("page");
                table.innerHTML = "";
                for(var i=0;i<10;i++){
                    var trNode = table.insertRow();
                    var tdNode = trNode.insertCell();
                    tdNode.style.textAlign = "center";
                    tdNode.innerHTML = (i+1);
                    var tdNode = trNode.insertCell();
                    tdNode.style.textAlign = "center";
                    tdNode.innerHTML = statisticResultList[i].stu1;
                    var tdNode = trNode.insertCell();
                    tdNode.style.textAlign = "center";
                    tdNode.innerHTML = statisticResultList[i].stu2;
                    var tdNode = trNode.insertCell();
                    tdNode.style.textAlign = "center";
                    tdNode.innerHTML = statisticResultList[i].maxSim+"%";
                    // console.log("all:"+JSON.stringify(statisticResultList[i]));
                    var tdNode = trNode.insertCell();
                    tdNode.style.textAlign = "center";
                    // console.log("isPlag:"+statisticResultList[i].plag);
                    if(statisticResultList[i].plag){
                        tdNode.innerHTML = "是";
                    }else{
                        tdNode.innerHTML = "否";
                    }
                    var tdNode = trNode.insertCell();
                    tdNode.style.textAlign = "center";
                    tdNode.innerHTML = "<button class=\"button-green\" id=\"Stu1\" style=\"font-size: 20px;\"\n" +
                        "                                        onclick=\"{location.href='../tool/detail.html'}\">详情\n" +
                        "                                </button>";



                }
                // console.log(statisticResultList.length);
                // for(var j=0;j<(statisticResultList.length/10);j++){
                //     var index = j+2;
                //     console.log("in:"+statisticResultList.length);
                //     page.append("<a href=\"#\">"+index+"</a>");
                // }


            },
            error: function (err) {
                alert("检测出错!");

            }
        }

    )
}

function generateReport() {
    var url = "/API/TF/generateReport?subject=Tarjan";
    var subject = "Tarjan";
    $.ajax({
        url: url,
        type: "GET",
        // data: JSON.stringify({
        //     subject: subject
        // }),
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        success: function (result) {
            alert("生成报告成功！")
        },
        error: function (err) {
            alert("生成报告出错!");

        }
    }
    )
}