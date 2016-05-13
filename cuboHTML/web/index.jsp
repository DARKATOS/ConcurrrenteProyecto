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
        <script type="text/javascript" src="js1.js"></script>
        <title>Cubo de Rubik</title>
    </head>
    <body>
        <section id="rubik">
            <div id="cube-container">
                <div id="cube-viewport">
                    <div id="cube" style="-webkit-transform: rotateX(0deg) rotateY(130deg)">
                        <!-- UP FACE -->            
                        <!-- LEFT COLUMN (L)  -->                
                        <div class="utl cubie" id="cara0cuadro0"><div><span>U1</span></div></div> 
                        <div class="ucl cubie" id="cara0cuadro3"><div><span>U2</span></div></div>
                        <div class="ubl cubie" id="cara0cuadro6"><div><span>U3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->            
                        <div class="utc cubie" id="cara0cuadro1"><div><span>U4</span></div></div>
                        <div class="ucc cubie" id="cara0cuadro4"><div><span>U5</span></div></div>
                        <div class="ubc cubie" id="cara0cuadro7"><div><span>U6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->
                        <div class="utr cubie" id="cara0cuadro2"><div><span>U7</span></div></div>
                        <div class="ucr cubie" id="cara0cuadro5"><div><span>U8</span></div></div>
                        <div class="ubr cubie" id="cara0cuadro8"><div><span>U9</span></div></div>
                        <!-- END UP FACE -->  

                        <!-- FRONT FACE -->
                        <!-- LEFT COLUMN (L)  -->                
                        <div class="ftl cubie" id="cara1cuadro0"><div><span>F1</span></div></div>
                        <div class="fcl cubie" id="cara1cuadro3"><div><span>F2</span></div></div>
                        <div class="fbl cubie" id="cara1cuadro6"><div><span>F3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->            
                        <div class="ftc cubie" id="cara1cuadro1"><div><span>F4</span></div></div>
                        <div class="fcc cubie" id="cara1cuadro4"><div><span>F5</span></div></div>
                        <div class="fbc cubie" id="cara1cuadro7"><div><span>F6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->
                        <div class="ftr cubie" id="cara1cuadro2"><div><span>F7</span></div></div>
                        <div class="fcr cubie" id="cara1cuadro5"><div><span>F8</span></div></div>
                        <div class="fbr cubie" id="cara1cuadro8"><div><span>F9</span></div></div>
                        <!-- END FRONT FACE -->

                        <!--DOWN FACE -->
                        <!-- LEFT COLUMN (L)  -->                
                        <div class="dtl cubie" id="cara5cuadro0"><div><span>D1</span></div></div>
                        <div class="dcl cubie" id="cara5cuadro3"><div><span>D2</span></div></div>
                        <div class="dbl cubie" id="cara5cuadro6"><div><span>D3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->                
                        <div class="dtc cubie" id="cara5cuadro1"><div><span>D4</span></div></div>
                        <div class="dcc cubie" id="cara5cuadro4"><div><span>D5</span></div></div>
                        <div class="dbc cubie" id="cara5cuadro7"><div><span>D6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->        
                        <div class="dtr cubie" id="cara5cuadro2"><div><span>D7</span></div></div>
                        <div class="dcr cubie" id="cara5cuadro5"><div><span>D8</span></div></div>
                        <div class="dbr cubie" id="cara5cuadro8"><div><span>D9</span></div></div>
                        <!-- END DOWN FACE -->

                        <!--BACK FACE -->    
                        <!-- LEFT COLUMN (L)  -->           
                        <div class="btl cubie" id="cara3cuadro0"><div><span>B1</span></div></div>
                        <div class="bcl cubie" id="cara3cuadro3"><div><span>B2</span></div></div>
                        <div class="bbl cubie" id="cara3cuadro6"><div><span>B3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->           
                        <div class="btc cubie" id="cara3cuadro1"><div><span>B4</span></div></div>
                        <div class="bcc cubie" id="cara3cuadro4"><div><span>B5</span></div></div>
                        <div class="bbc cubie" id="cara3cuadro7"><div><span>B6</span></div></div> 
                        <!-- RIGHT COLUMN (R)  -->    
                        <div class="btr cubie" id="cara3cuadro2"><div><span>B7</span></div></div>
                        <div class="bcr cubie" id="cara3cuadro5"><div><span>B8</span></div></div>
                        <div class="bbr cubie" id="cara3cuadro8"><div><span>B9</span></div></div> 
                        <!--END BOTTOM FACE --> 

                        <!--LEFT FACE -->
                        <!-- LEFT COLUMN (L)  -->           
                        <div class="ltl cubie" id="cara4cuadro0"><div><span>L1</span></div></div>
                        <div class="lcl cubie" id="cara4cuadro3"><div><span>L2</span></div></div>
                        <div class="lbl cubie" id="cara4cuadro6"><div><span>L3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->  
                        <div class="ltc cubie" id="cara4cuadro1"><div><span>L4</span></div></div>
                        <div class="lcc cubie" id="cara4cuadro4"><div><span>L5</span></div></div>
                        <div class="lbc cubie" id="cara4cuadro7"><div><span>L6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->    
                        <div class="ltr cubie" id="cara4cuadro2"><div><span>L7</span></div></div>
                        <div class="lcr cubie" id="cara4cuadro5"><div><span>L8</span></div></div>
                        <div class="lbr cubie" id="cara4cuadro8"><div><span>L9</span></div></div>
                        <!--END LEFT FACE -->   

                        <!--RIGHT FACE -->
                        <!-- LEFT COLUMN (L)  -->           
                        <div class="rtl cubie" id="cara2cuadro0"><div><span>R1</span></div></div>
                        <div class="rcl cubie" id="cara2cuadro3"><div><span>R2</span></div></div>
                        <div class="rbl cubie" id="cara4cuadro6"><div><span>R3</span></div></div>
                        <!-- CENTER COLUMN (C)  -->  
                        <div class="rtc cubie" id="cara2cuadro1"><div><span>R4</span></div></div>
                        <div class="rcc cubie" id="cara2cuadro4"><div><span>R5</span></div></div>
                        <div class="rbc cubie" id="cara2cuadro7"><div><span>R6</span></div></div>
                        <!-- RIGHT COLUMN (R)  -->    
                        <div class="rtr cubie" id="cara2cuadro2"><div><span>R7</span></div></div>
                        <div class="rcr cubie" id="cara2cuadro5"><div><span>R8</span></div></div>
                        <div class="rbr cubie" id="cara2cuadro8"><div><span>R9</span></div></div>
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
