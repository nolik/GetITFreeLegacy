/**
 * Created by max on 12.04.17.
 */
$(document).ready(function(){

    $('.valera').hover(
        function(){
            $(this).addClass('active');
        },
        function(){
            $(this).removeClass('active');
        }
    );

});