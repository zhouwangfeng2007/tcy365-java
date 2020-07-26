var tcyDialog;
function frame(titleText, url, width, height) {
    tcyDialog = $.dialog({
        title: titleText,
        width: width,
        height: height,
        content: 'url:' + url,
    });
}

 

 

