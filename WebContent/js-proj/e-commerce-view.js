$(document).ready(function() {
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);
	function hideURLbar() {
		window.scrollTo(0, 1);
	} 
	$('#ipresenter').iPresenter({
		timerPadding : -1,
		controlNav : true,
		controlNavThumbs : true,
		controlNavNextPrev : false
	});
	
	$('#etalage').etalage({
		thumb_image_width: 300,
		thumb_image_height: 400,
		source_image_width: 800,
		source_image_height: 1000,
		show_hint: true,
		click_callback: function(image_anchor, instance_id){
			alert('Callback example:\nYou clicked on an image with the anchor: "'+image_anchor+'"\n(in Etalage instance: "'+instance_id+'")');
		}
	});
	
	$('#horizontalTab').easyResponsiveTabs({
        type: 'default', //Types: default, vertical, accordion           
        width: 'auto', //auto or any width like 600px
        fit: true,   // 100% fit in a container
        closed: 'accordion', // Start closed if in accordion view
        activate: function(event) { // Callback function if tab is switched
            var $tab = $(this);
            var $info = $('#tabInfo');
            var $name = $('span', $info);
            $name.text($tab.text());
            $info.show();
        }
    });

    $('#verticalTab').easyResponsiveTabs({
        type: 'vertical',
        width: 'auto',
        fit: true
    });
    
    $(".scroll").click(function(event) {
		event.preventDefault();
		$('html,body').animate({
			scrollTop : $(this.hash).offset().top
		}, 1200);
	});
    
    $("span.menu").click(function() {
		$(".top-menu ul").slideToggle("slow", function() {
		});
	});
    
    $("#owl-demo").owlCarousel({
		items : 3,
		lazyLoad : true,
		autoPlay : true,
		navigation : true,
		navigationText : false,
		pagination : false,
	});
    
    $("#owl-demo1").owlCarousel({
		items : 3,
		lazyLoad : true,
		autoPlay : true,
		navigation : true,
		navigationText : false,
		pagination : false,
	});
    
    $("#owl-demo2").owlCarousel({
		items : 3,
		lazyLoad : true,
		autoPlay : true,
		navigation : false,
		navigationText : false,
		pagination : false,
	});
	
});