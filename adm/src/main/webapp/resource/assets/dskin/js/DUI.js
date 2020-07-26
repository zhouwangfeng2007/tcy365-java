// JavaScript Document
$(function(){
	//index		
	$(".d-tip .close").bind("click",function(){
		$(this).parent().fadeOut();	
	});
	$(".d-panel h3 .close").toggle(function(){
		$(this).parent().siblings().slideUp();	
	},function(){
		$(this).parent().siblings().slideDown();	
	});
	$("#J_line-oper").click(function(){
		var $tree=$("#J_menutree"),$main=$("#d-main");
		if($tree.css("display")!="none"){
			$tree.css("display","none");	
			$(this).removeClass("d-oper-open").addClass("d-oper-close")
			$main.css("padding-left","10px");
		}else{
			$(this).removeClass("d-oper-close").addClass("d-oper-open")
			$tree.css("display","block");
			$main.css("padding-left","210px");
		}	
	});
	//输入框变色
	$(".d-form-input").bind("focus",function(){
		if($(this).hasClass("no-hover")){return;}
		$(this).addClass("d-input-foucs");	
	});
	$(".d-form-input").bind("blur",function(){
		if($(this).hasClass("no-hover")){return;}
		$(this).removeClass("d-input-foucs");	
	});
	$(".d-form-textarea").bind("focus",function(){
		if($(this).hasClass("no-hover")){return;}
		$(this).addClass("d-input-foucs");	
	});
	$(".d-form-textarea").bind("blur",function(){
		if($(this).hasClass("no-hover")){return;}
		$(this).removeClass("d-input-foucs");	
	});
	$(".d-form-select").hover(function(){
		$(this).addClass("d-input-foucs")},function(){
		$(this).removeClass("d-input-foucs")	
			});
			
});
//标题项 显示项
function D_tabs(items,view){
		var $tabsHead=$(items),
		$tabsView=$(view),
		$tabsHeadList=$tabsHead.find(".jd-tabs-item"),
		$tabsViewList=$tabsView.find(".jd-tabs-view"),
		index=0;
		$tabsHeadList.bind("click",function(){
			index=$tabsHeadList.index($(this));			
			$(this).addClass("on").siblings().removeClass("on");
			$tabsViewList.eq(index).show().siblings().hide();	
		});
}
//展开项 主容器
function D_submenu(oneitem,obj){
	var $obj=$(obj),$oneitem=$(oneitem);
	$oneitem.bind("click",function(){
		var $subUl=$(this).parent().find("ul")
		if($subUl.css("display")!="none"){
			$(this).find(".ico").removeClass("on");
			$(this).parent().find("ul").hide();	
		}else{
			$(this).find(".ico").addClass("on");
			$(this).parent().find("ul").show();	
		}
		
	});
	var $treeItem=$obj.find(".item").not(oneitem);
	$treeItem.bind("click",function(){
		$treeItem.removeClass("itemon");
		$(this).addClass("itemon");
	});	
}


