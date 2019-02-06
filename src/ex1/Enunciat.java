package ex1;

public class Enunciat {
/*
    1. Copia la classe HashTable.java del package "original" a "ex1" i munta-hi un joc de proves per als mètodes "put",
       get" i "drop". Dins els jocs de proves pots fer servir el mètode "toString" que proporciona la taula de hash per
       a obtenir una cadena de text que representa el seu contingut. IMPORTANT: explica dins el joc de proves quins
       passos estàs seguint i què pretens provar o aconseguir amb cada execució.

    2. SOLUCIONA els errors que hi trobis i explica quins canvis has fet fent servir comentaris que comencin
    per ERROR: #comentari. Per exemple -> ERROR: he hagut de canviar...

    3. NO HI APLIQUIS REFRACCIÓ!!!

-----------------------------------------------------------------------------------------------------------------------

    A continuació s'explica el funcionament de la implementació de taula de hash proposada:

    Una taula de hash representa un magatzem de valors ordenats (similar a un array) on els elements es
    componen d'una clau i un valor.

        [0] -> <clau, valor>
        [1] -> <clau, valor>
         .
         .
         .
        [n] -> <clau, valor>

    Quan es vol afegir un element a la taula de hash, s'indica quina és la clau del valor a afegir, per exemple:
    si es vol afegir un objecte de tipus Persona a la taula, s'indicarà la clau de la Persona (el seu ID) i la mateixa
    persona ->; hashtable.put(persona.ID, persona)

    La taula de hash col·locarà a aquesta persona en una posició fixa calculada, per exemple la posició 32. Quan un
    programador vulgui recuperar la persona, necessitarà saber-ne el ID perquè la taula de hash la pugui retornar:
    per exemple ->; hastable.get(persona.ID)

    És a dir, es pot veure una taula de hash com un array, on trobar un element es fa a l'instant en comptes de fer
    cerques seqüencials.

    Problema: les col·lisions. Com s'ha comentat, la taula de hash calcula la posició a assignar aplicant un algoritme
    sobre el ID, però això vol dir que diferents IDs poden resultar en la mateixa posició. La forma de solucionar-ho és
    convertir les posicions de la hash table en llistes enllaçades tal que així:

        [0] -> 	<clau, valor>
                <clau, valor>
                <clau, valor>

        [1] ->  <clau, valor>
         .		<clau, valor>
         .
         .
        [n] ->  <clau, valor>
                <clau, valor>

    Com es pot veure a l'exemple anterior, hi ha 3 elements que corresponen a la posició 0, 2 per a la 1, etc.
    Amb aquest canvi, l'accés es converteix en semi-directe, ja que la posició a la llista interna si és directa,
    però l'element s'ha de buscar seqüencialment dins aquesta llista. Tingues en compte que el ID ha de ser únic, per
    tant dos elements diferents amb el mateix ID s'estaran sobreescrivint l'un sobre l'altre.

    Exemple amb valor simulats:

        //la taula de hash es buida ->				[]

        ht.put(99, p1);				->				[0]
                                                    [1]
                                                     .
                                                     .
                                                     .
                                                    [9] ->	<99, p1>
                                                     .
                                                     .
                                                     .
                                                    [n]


        ht.put(21, p2)				->				[0]
                                                    [1] -> 	<21, p2>
                                                     .
                                                     .
                                                     .
                                                    [9] ->	<99, p1>
                                                     .
                                                     .
                                                     .
                                                    [n]

        ht.put(2, p3)				->				[0]
                                                    [1] -> 	<21, p2>
                                                     .
                                                     .
                                                     .
                                                    [9] ->	<99, p1>
                                                     .		<02, p3>
                                                     .
                                                     .
                                                    [n]

        ht.put(2, p4)				->				[0]
                                                    [1] -> 	<21, p2>
                                                     .
                                                     .
                                                     .
                                                    [9] ->	<99, p1>
                                                     .		<02, p4>
                                                     .
                                                     .
                                                    [n]
*/
}
