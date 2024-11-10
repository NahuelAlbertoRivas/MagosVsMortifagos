producto_cartesiano_vida_mortifago(X, Y, Ronda):-
    estado_mortifago(_, _, X, Ronda),
    estado_mortifago(_, _, Y, Ronda).

seleccion_vida_mortifago(X, Y, Ronda):-
    producto_cartesiano_vida_mortifago(X, Y, Ronda), 
    X < Y.

proyeccion_vida_mortifago(X, Ronda):-
    seleccion_vida_mortifago(X, _, Ronda).

todos_menos_max_vida_mortifago(X, Ronda):-
    proyeccion_vida_mortifago(X, Ronda).

max_vida_mortifago(Nombre, NivelMagia, NivelVida, Ronda):-
    estado_mortifago(Nombre, NivelMagia, NivelVida, Ronda),
    \+ todos_menos_max_vida_mortifago(NivelVida, Ronda).

producto_cartesiano_magia_mortifago(X, Y, Ronda):-
    max_vida_mortifago(_, X, _, Ronda),
    max_vida_mortifago(_, Y, _, Ronda).

seleccion_magia_mortifago(X, Y, Ronda):-
    producto_cartesiano_magia_mortifago(X, Y, Ronda), 
    X < Y.

proyeccion_magia_mortifago(X, Ronda):-
    seleccion_magia_mortifago(X, _, Ronda).

todos_menos_max_magia_mortifago(X, Ronda):-
    proyeccion_magia_mortifago(X, Ronda).

objetivo_deseable_mortifago(Nombre, NivelMagia, NivelVida, Ronda):-
    max_vida_mortifago(Nombre, NivelMagia, NivelVida, Ronda),
    \+ todos_menos_max_magia_mortifago(NivelMagia, Ronda).

/*
% El objetivo deseable es aquél personaje que tiene:
% 1°) más salud
% 2°) mayor nivel de magia
*/
