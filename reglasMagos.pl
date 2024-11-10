producto_cartesiano_vida_mago(X, Y, Ronda):-
    estado_mago(_, _, X, Ronda),
    estado_mago(_, _, Y, Ronda).

seleccion_vida_mago(X, Y, Ronda):-
    producto_cartesiano_vida_mago(X, Y, Ronda), 
    X < Y.

proyeccion_vida_mago(X, Ronda):-
    seleccion_vida_mago(X, _, Ronda).

todos_menos_max_vida_mago(X, Ronda):-
    proyeccion_vida_mago(X, Ronda).

max_vida_mago(Nombre, NivelMagia, NivelVida, Ronda):-
    estado_mago(Nombre, NivelMagia, NivelVida, Ronda),
    \+ todos_menos_max_vida_mago(NivelVida, Ronda).

producto_cartesiano_magia_mago(X, Y, Ronda):-
    max_vida_mago(_, X, _, Ronda),
    max_vida_mago(_, Y, _, Ronda).

seleccion_magia_mago(X, Y, Ronda):-
    producto_cartesiano_magia_mago(X, Y, Ronda), 
    X < Y.

proyeccion_magia_mago(X, Ronda):-
    seleccion_magia_mago(X, _, Ronda).

todos_menos_max_magia_mago(X, Ronda):-
    proyeccion_magia_mago(X, Ronda).

objetivo_deseable_mago(Nombre, NivelMagia, NivelVida, Ronda):-
    max_vida_mago(Nombre, NivelMagia, NivelVida, Ronda),
    \+ todos_menos_max_magia_mago(NivelMagia, Ronda).

/*
% El objetivo deseable es aquél personaje que tiene:
% 1°) más salud
% 2°) mayor nivel de magia
*/
