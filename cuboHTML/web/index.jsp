<%-- 
    Document   : index
    Created on : 7/05/2016, 10:14:34 AM
    Author     : Jorge Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="cubocss.css">
        <title>Cubo de Rubik</title>
    </head>
    <body>
        <section id="rubik">
            <div id="cube-container">
                <div id="cube-viewport">
                    <div id="cube" style="-webkit-transform: rotateX(0deg) rotateY(130deg)">
                        <!-- UP FACE -->            
                        <!-- LEFT COLUMN (L)  -->                
                        <div class="utl cubie" id="cara0cuadro1"><div><span>U1</span></div></div> 
                        <div class="ucl cubie"><div><span>U2</span></div></div>
                        <div class="ubl cubie"><div><span>U3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->            
                        <div class="utc cubie"><div><span>U4</span></div></div>
                        <div class="ucc cubie"><div><span>U5</span></div></div>
                        <div class="ubc cubie"><div><span>U6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->
                        <div class="utr cubie"><div><span>U7</span></div></div>
                        <div class="ucr cubie"><div><span>U8</span></div></div>
                        <div class="ubr cubie"><div><span>U9</span></div></div>
                        <!-- END UP FACE -->  

                        <!-- FRONT FACE -->
                        <!-- LEFT COLUMN (L)  -->                
                        <div class="ftl cubie"><div><span>F1</span></div></div>
                        <div class="fcl cubie"><div><span>F2</span></div></div>
                        <div class="fbl cubie"><div><span>F3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->            
                        <div class="ftc cubie"><div><span>F4</span></div></div>
                        <div class="fcc cubie"><div><span>F5</span></div></div>
                        <div class="fbc cubie"><div><span>F6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->
                        <div class="ftr cubie"><div><span>F7</span></div></div>
                        <div class="fcr cubie"><div><span>F8</span></div></div>
                        <div class="fbr cubie"><div><span>F9</span></div></div>
                        <!-- END FRONT FACE -->

                        <!--DOWN FACE -->
                        <!-- LEFT COLUMN (L)  -->                
                        <div class="dtl cubie"><div><span>D1</span></div></div>
                        <div class="dcl cubie"><div><span>D2</span></div></div>
                        <div class="dbl cubie"><div><span>D3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->                
                        <div class="dtc cubie"><div><span>D4</span></div></div>
                        <div class="dcc cubie"><div><span>D5</span></div></div>
                        <div class="dbc cubie"><div><span>D6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->        
                        <div class="dtr cubie"><div><span>D7</span></div></div>
                        <div class="dcr cubie"><div><span>D8</span></div></div>
                        <div class="dbr cubie"><div><span>D9</span></div></div>
                        <!-- END DOWN FACE -->

                        <!--BACK FACE -->    
                        <!-- LEFT COLUMN (L)  -->           
                        <div class="btl cubie"><div><span>B1</span></div></div>
                        <div class="bcl cubie"><div><span>B2</span></div></div>
                        <div class="bbl cubie"><div><span>B3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->           
                        <div class="btc cubie"><div><span>B4</span></div></div>
                        <div class="bcc cubie"><div><span>B5</span></div></div>
                        <div class="bbc cubie"><div><span>B6</span></div></div> 
                        <!-- RIGHT COLUMN (R)  -->    
                        <div class="btr cubie"><div><span>B7</span></div></div>
                        <div class="bcr cubie"><div><span>B8</span></div></div>
                        <div class="bbr cubie"><div><span>B9</span></div></div> 
                        <!--END BOTTOM FACE --> 

                        <!--LEFT FACE -->
                        <!-- LEFT COLUMN (L)  -->           
                        <div class="ltl cubie"><div><span>L1</span></div></div>
                        <div class="lcl cubie"><div><span>L2</span></div></div>
                        <div class="lbl cubie"><div><span>L3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->  
                        <div class="ltc cubie"><div><span>L4</span></div></div>
                        <div class="lcc cubie"><div><span>L5</span></div></div>
                        <div class="lbc cubie"><div><span>L6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->    
                        <div class="ltr cubie"><div><span>L7</span></div></div>
                        <div class="lcr cubie"><div><span>L8</span></div></div>
                        <div class="lbr cubie"><div><span>L9</span></div></div>
                        <!--END LEFT FACE -->   

                        <!--RIGHT FACE -->
                        <!-- LEFT COLUMN (L)  -->           
                        <div class="rtl cubie"><div><span>R1</span></div></div>
                        <div class="rcl cubie"><div><span>R2</span></div></div>
                        <div class="rbl cubie"><div><span>R3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->  
                        <div class="rtc cubie"><div><span>R4</span></div></div>
                        <div class="rcc cubie"><div><span>R5</span></div></div>
                        <div class="rbc cubie"><div><span>R6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->    
                        <div class="rtr cubie"><div><span>R7</span></div></div>
                        <div class="rcr cubie"><div><span>R8</span></div></div>
                        <div class="rbr cubie"><div><span>R9</span></div></div>
                        <!--END LEFT FACE -->  

                    </div>
                </div>
            </div>  
        </section>

        <!-- CONTROLS -->
        <section id="control">
            <p>X: <input id="rx" type="range" max="360" min="0" value="0" onchange="rotate()"></p>
            <p>Y: <input id="ry" type="range" max="360" min="0" value="130" onchange="rotate()"></p>
            <p>Plane: <input id="plane" type="checkbox" onclick="showPlane(this)"></p>
            <script>
                document.querySelector('#cube').addEventListener("mousemove", mouseOver, false);
                function mouseOver(e) {
                    var x = e.pageX * 0.2,
                            y = e.pageY * 0.2;
                    rotate(x, y);
                }
                function showPlane(c) {
                    document.querySelector('#cube').style.background = c.checked ? '#CCC' : '';
                }
                function rotate(newX, newY) {
                    var x = parseInt(document.querySelector('#rx').value, 10) + (newX || 0),
                            y = parseInt(document.querySelector('#ry').value, 10) + (newY || 0),
                            cube = document.getElementById('cube');

                    cube.style.webkitTransform = "rotateX(" + x + "deg) rotateY(" + y + "deg)";
                    cube.style.MozTransform = "rotateX(" + x + "deg) rotateY(" + y + "deg)";
                    //cube.style.transform = "rotateX(" + x + "deg) rotateY(" + y + "deg)";
                }
                elemento=document.getElementById("cara0cuadro1");
                elemento.style.backgroundColor="red";
            </script>
        </section>
    </body>
</html>
