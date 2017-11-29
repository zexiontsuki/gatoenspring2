<!DOCTYPE html>
  <html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Gato</title>
    </head>
    <body>
        <div class="container">
            <h1>Gato :3</h1>
            <ul id="game">
                <!-- primera -->
                <li data-pos="0,0"></li>
                <li data-pos="0,1"></li>
                <li data-pos="0,2"></li>
                <!-- segunda -->
                <li data-pos="1,0"></li>
                <li data-pos="1,1"></li>
                <li data-pos="1,2"></li>
                <!-- tercera -->
                <li data-pos="2,0"></li>
                <li data-pos="2,1"></li>
                <li data-pos="2,2"></li>
            </ul>

            <button id="reset-game">Reiniciar Juego</button>

            <!-- Mensajes -->
            <div id="game-messages">
                <span class="player-x-win">Jugador uno gana!</span>
                <span class="player-o-win">Jugador dos gana!</span>
                <span class="draw">Empate</span>
            </div>

            <aside id="nfo">
                <h2>Turno</h2>
                <div id="whos-turn" class="x">
                    <span class="x">Jugador 1</span>
                    <span class="o">Jugador 2</span>
                </div>

                <h2>Puntuación</h2>
                <div id="score">
                    Jugador 1: <span id="player-one-score">0</span> <br />
                    Jugador 2: <span id="player-two-score">0</span> <br />
                </div>
            </aside>
        </div>
    </body>
</html>

    <script  src="js/index.js"></script>
    <audio src="dsn.mp3" autoplay="true" loop></audio>

</body>
</html>
