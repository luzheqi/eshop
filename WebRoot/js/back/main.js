$(function init() {

	$("#operation").accordion();
	
	$("#addCommodity").click(function() {
		$(".content").attr("src","back/addCommodity.action");
	});
	
	$("#CommodityManager").click(function() {
		$(".content").attr("src","back/CommodityManager.action");
	});
	
	$("#BuyerManager").click(function() {
		$(".content").attr("src","back/BuyerManager.action");
	});
	
	$("#SUM").click(function() {
		$(".content").attr("src","back/SUM.action");
	});
	
	$("#PayWayManager").click(function() {
		$(".content").attr("src","back/PayWayManager.action");
	});
	
	$("#CarriageManager").click(function() {
		$(".content").attr("src","back/CarriageManager.action");
	});
	
});



