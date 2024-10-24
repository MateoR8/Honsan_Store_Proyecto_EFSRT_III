Drop database if exists Honsan_Store_BD;
create database Honsan_Store_BD;
use Honsan_Store_BD;

-- Luego de ejecutar el proyecto realizar estos inserts

-- Novelas
INSERT INTO tb_novela (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('NOV001', 'La Sombra del Viento', 'Novela', 'Carlos Ruiz Zafón', '2001-01-01', 89.00, 5),
('NOV002', 'El Laberinto de los Espíritus', 'Novela', 'Carlos Ruiz Zafón', '2016-01-01', 95.00, 3),
('NOV003', 'La Tregua', 'Novela', 'Mario Benedetti', '2015-01-01', 75.00, 4),
('NOV004', 'Patria', 'Novela', 'Fernando Aramburu', '2016-01-01', 98.00, 2),
('NOV005', 'Los Detectives Salvajes', 'Novela', 'Roberto Bolaño', '2016-01-01', 120.00, 5),
('NOV006', 'El Ruido de las Cosas al Caer', 'Novela', 'Juan Gabriel Vásquez', '2011-01-01', 86.00, 4),
('NOV007', 'Sidi', 'Novela', 'Arturo Pérez-Reverte', '2019-01-01', 110.00, 3),
('NOV008', 'La Fiesta del Chivo', 'Novela', 'Mario Vargas Llosa', '2000-01-01', 99.00, 5),
('NOV009', 'Aquitania', 'Novela', 'Eva García Sáenz de Urturi', '2020-01-01', 85.00, 4);

-- Romance
INSERT INTO TB_Romance (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('ROM001', 'Valeria en el Espejo', 'Romance', 'Elísabet Benavent', '2013-01-01', 80.00, 5),
('ROM002', 'Fuimos Canciones', 'Romance', 'Elísabet Benavent', '2018-01-01', 85.00, 3),
('ROM003', 'Mi Isla', 'Romance', 'Elísabet Benavent', '2016-01-01', 92.00, 4),
('ROM004', 'Todo lo que Nunca Fuimos', 'Romance', 'Alice Kellen', '2019-01-01', 78.00, 5),
('ROM005', 'Antes de Diciembre', 'Romance', 'Joana Marcús', '2020-01-01', 77.00, 2),
('ROM006', 'El Día que el Cielo se Caiga', 'Romance', 'Megan Maxwell', '2016-01-01', 89.00, 3),
('ROM007', 'Boulevard', 'Romance', 'Flor M. Salvador', '2020-01-01', 76.00, 4),
('ROM008', 'Nosotros en la Luna', 'Romance', 'Alice Kellen', '2020-01-01', 82.00, 5),
('ROM009', 'Culpa Mía', 'Romance', 'Mercedes Ron', '2017-01-01', 90.00, 3);

-- Horror
INSERT INTO TB_Horror (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('HOR001', 'Cementerio de Animales', 'Horror', 'Stephen King', '2019-01-01', 89.00, 5),
('HOR002', 'It', 'Horror', 'Stephen King', '2017-01-01', 90.00, 4),
('HOR003', 'El Resplandor', 'Horror', 'Stephen King', '2015-01-01', 92.00, 3),
('HOR004', 'El Instituto', 'Horror', 'Stephen King', '2019-01-01', 100.00, 2),
('HOR005', 'Doctor Sueño', 'Horror', 'Stephen King', '2019-01-01', 95.00, 3),
('HOR006', 'La Casa Infernal', 'Horror', 'Richard Matheson', '2020-01-01', 89.00, 4),
('HOR007', 'El Exorcista', 'Horror', 'William Peter Blatty', '2016-01-01', 92.00, 3),
('HOR008', 'Carrie', 'Horror', 'Stephen King', '2018-01-01', 85.00, 5),
('HOR009', 'El Visitante', 'Horror', 'Stephen King', '2018-01-01', 98.00, 2);

-- Infantil
INSERT INTO TB_INFANTIL (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('INF001', 'El Monstruo de Colores', 'Infantil', 'Anna Llenas', '2012-01-01', 76.00, 5),
('INF002', 'Adivina Cuánto Te Quiero', 'Infantil', 'Sam McBratney', '2012-01-01', 65.00, 3),
('INF003', 'Elmer', 'Infantil', 'David McKee', '2017-01-01', 72.00, 4),
('INF004', 'Donde Viven los Monstruos', 'Infantil', 'Maurice Sendak', '2015-01-01', 89.00, 5),
('INF005', 'El Principito', 'Infantil', 'Antoine de Saint-Exupéry', '2016-01-01', 75.00, 5),
('INF006', 'La Pequeña Oruga Glotona', 'Infantil', 'Eric Carle', '2019-01-01', 78.00, 4),
('INF007', 'Harry Potter y la Piedra Filosofal', 'Infantil', 'J.K. Rowling', '2014-01-01', 92.00, 3),
('INF008', 'Charlie y la Fábrica de Chocolate', 'Infantil', 'Roald Dahl', '2017-01-01', 88.00, 2),
('INF009', 'Matilda', 'Infantil', 'Roald Dahl', '2019-01-01', 85.00, 4);

-- Autoayuda
INSERT INTO TB_auto_ayuda (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('AUT001', 'Los Cuatro Acuerdos', 'Autoayuda', 'Miguel Ruiz', '2018-01-01', 90.00, 5),
('AUT002', 'Tus Zonas Erróneas', 'Autoayuda', 'Wayne Dyer', '2015-01-01', 85.00, 3),
('AUT003', 'El Poder del Ahora', 'Autoayuda', 'Eckhart Tolle', '2016-01-01', 80.00, 4),
('AUT004', 'Sé Más Feliz', 'Autoayuda', 'Tal Ben-Shahar', '2019-01-01', 95.00, 5),
('AUT005', 'Hábitos Atómicos', 'Autoayuda', 'James Clear', '2020-01-01', 88.00, 2),
('AUT006', 'El Monje que Vendió su Ferrari', 'Autoayuda', 'Robin Sharma', '2019-01-01', 90.00, 3),
('AUT007', 'Cómo Ganar Amigos e Influir sobre las Personas', 'Autoayuda', 'Dale Carnegie', '2018-01-01', 78.00, 4),
('AUT008', 'El Hombre en Busca de Sentido', 'Autoayuda', 'Viktor Frankl', '2015-01-01', 86.00, 5),
('AUT009', 'Deja de Ser Tú', 'Autoayuda', 'Joe Dispenza', '2017-01-01', 89.00, 3);

-- Aventura
INSERT INTO TB_aventura (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('AVE001', 'La Isla del Tesoro', 'Aventura', 'Robert Louis Stevenson', '2015-01-01', 90.00, 3),
('AVE002', 'Las Aventuras de Tom Sawyer', 'Aventura', 'Mark Twain', '2016-01-01', 85.00, 5),
('AVE003', 'Veinte Mil Leguas de Viaje Submarino', 'Aventura', 'Julio Verne', '2017-01-01', 92.00, 2),
('AVE004', 'Moby Dick', 'Aventura', 'Herman Melville', '2018-01-01', 88.00, 4),
('AVE005', 'La Vuelta al Mundo en 80 Días', 'Aventura', 'Julio Verne', '2019-01-01', 86.00, 5),
('AVE006', 'Los Tres Mosqueteros', 'Aventura', 'Alexandre Dumas', '2020-01-01', 95.00, 3),
('AVE007', 'Robinson Crusoe', 'Aventura', 'Daniel Defoe', '2020-01-01', 98.00, 2),
('AVE008', 'El Conde de Montecristo', 'Aventura', 'Alexandre Dumas', '2019-01-01', 100.00, 4),
('AVE009', 'La Odisea', 'Aventura', 'Homero', '2020-01-01', 95.00, 3);


-- Ciencia Ficción
INSERT INTO TB_CIENCIA_FICCION (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('CIF001', 'Dune', 'Ciencia Ficción', 'Frank Herbert', '2019-01-01', 100.00, 4),
('CIF002', 'El Juego de Ender', 'Ciencia Ficción', 'Orson Scott Card', '2013-01-01', 85.00, 3),
('CIF003', 'Fundación', 'Ciencia Ficción', 'Isaac Asimov', '2016-01-01', 90.00, 5),
('CIF004', 'Neuromante', 'Ciencia Ficción', 'William Gibson', '2016-01-01', 95.00, 2),
('CIF005', 'Snow Crash', 'Ciencia Ficción', 'Neal Stephenson', '2020-01-01', 105.00, 5),
('CIF006', 'Ready Player One', 'Ciencia Ficción', 'Ernest Cline', '2011-01-01', 92.00, 4),
('CIF007', 'El Marciano', 'Ciencia Ficción', 'Andy Weir', '2014-01-01', 88.00, 5),
('CIF008', 'El Problema de los Tres Cuerpos', 'Ciencia Ficción', 'Cixin Liu', '2014-01-01', 89.00, 3),
('CIF009', 'Hiperion', 'Ciencia Ficción', 'Dan Simmons', '2010-01-01', 120.00, 2);

-- Fantasía
INSERT INTO TB_FANTASIA (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('FAN001', 'El Nombre del Viento', 'Fantasía', 'Patrick Rothfuss', '2011-01-01', 95.00, 4),
('FAN002', 'La Canción de Hielo y Fuego', 'Fantasía', 'George R.R. Martin', '2011-01-01', 120.00, 2),
('FAN003', 'La Rueda del Tiempo', 'Fantasía', 'Robert Jordan', '2019-01-01', 100.00, 5),
('FAN004', 'Elantris', 'Fantasía', 'Brandon Sanderson', '2015-01-01', 89.00, 3),
('FAN005', 'Nacidos de la Bruma', 'Fantasía', 'Brandon Sanderson', '2019-01-01', 110.00, 4),
('FAN006', 'El Imperio Final', 'Fantasía', 'Brandon Sanderson', '2018-01-01', 105.00, 5),
('FAN007', 'La Sombra del Viento', 'Fantasía', 'Carlos Ruiz Zafón', '2001-01-01', 89.00, 3),
('FAN008', 'La Caída de Gondolin', 'Fantasía', 'J.R.R. Tolkien', '2018-01-01', 120.00, 2),
('FAN009', 'Harry Potter y las Reliquias de la Muerte', 'Fantasía', 'J.K. Rowling', '2007-01-01', 92.00, 4);

-- Cómic
INSERT INTO TB_COMIC (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('COM001', 'Batman: The Killing Joke', 'Cómic', 'Alan Moore', '2016-01-01', 80.00, 4),
('COM002', 'Maus', 'Cómic', 'Art Spiegelman', '2018-01-01', 85.00, 3),
('COM003', 'Persepolis', 'Cómic', 'Marjane Satrapi', '2017-01-01', 90.00, 2),
('COM004', 'Blue', 'Cómic', 'Pat Grant', '2019-01-01', 75.00, 5),
('COM005', 'Pride of Baghdad', 'Cómic', 'Brian K. Vaughan', '2015-01-01', 95.00, 3),
('COM006', 'Daytripper', 'Cómic', 'Fábio Moon', '2016-01-01', 88.00, 4),
('COM007', 'The Complete Maus', 'Cómic', 'Art Spiegelman', '2017-01-01', 100.00, 2),
('COM008', 'Hellboy: The Chained Coffin', 'Cómic', 'Mike Mignola', '2015-01-01', 82.00, 3),
('COM009', 'Sandman: Dream Country', 'Cómic', 'Neil Gaiman', '2018-01-01', 90.00, 4);

-- Manga
INSERT INTO TB_MANGA (codigo_libro, titulo_libro, genero_libro, autor_libro, anio_lanzamiento, precio_libro, stock_libro) VALUES
('MNG001', 'One Piece', 'Aventura', 'Eiichiro Oda', '1997-01-01', 12.99, 500),
('MNG002', 'Jujutsu Kaisen', 'Acción', 'Gege Akutami', '2018-01-01', 10.99, 450),
('MNG003', 'Chainsaw Man', 'Horror', 'Tatsuki Fujimoto', '2018-01-01', 11.49, 600),
('MNG004', 'Attack on Titan', 'Acción', 'Hajime Isayama', '2009-01-01', 13.99, 550),
('MNG005', 'Spy x Family', 'Comedia', 'Tatsuya Endo', '2019-01-01', 10.49, 400),
('MNG006', 'My Hero Academia', 'Acción', 'Kohei Horikoshi', '2014-01-01', 11.99, 700),
('MNG007', 'Blue Lock', 'Deporte', 'Muneyuki Kaneshiro', '2018-01-01', 9.99, 300),
('MNG008', 'Tokyo Revengers', 'Drama', 'Ken Wakui', '2017-01-01', 10.49, 650),
('MNG009', 'Demon Slayer', 'Fantasía', 'Koyoharu Gotouge', '2016-01-01', 14.49, 500);

SELECT * FROM tb_novela;
SELECT * FROM TB_Romance;
SELECT * FROM TB_Horror;
SELECT * FROM TB_INFANTIL;
SELECT * FROM TB_auto_ayuda;
SELECT * FROM TB_aventura;
SELECT * FROM TB_CIENCIA_FICCION;
SELECT * FROM TB_FANTASIA;
SELECT * FROM TB_COMIC;
SELECT * FROM TB_MANGA;


