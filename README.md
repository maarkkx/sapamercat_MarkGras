1-El carro es un HashMap ja que he pensat que puc posar el objecte com a clau i el valor que sigui la quantitat del producte. Si hi han dos productes repetits es comprova el codi de barras amb el equals i es suman
les dues quantitats.

2-El magatzem es una ArrayList ja que no m'interesa tenir cap tipus d'ordre. El filtrar es fa despres per tant no m'importa l'ordre dins d'aquesta arraylist.

3-Per fer el filtrat tant de textil com de data de caducitat es crea una nova llista temporal on es guarden tots els productes del tipus corresponent y despres amb un comparable a Alimentacio o comparator a Textil
i un sort es filtran segons el que vulgui.

4-Per la data de caducitat he agafat un tipus de dades diferent "LocalDate" que l'he exportat. Es posa en format "YYYY-MM-DD", aquest tipus de dades te funcions com .now() per poder saber la data de avui.

5-Faig un Stack o Pila de tickets per poder mostrar el ticket més recent primer. Ticket no es una clase ja que no em fa falta tractar-ho, en cas de que ho necessites si la faria. Amb una pila puc mostrar-los.

6-He fet una interficie "Data" per afegir una funcio de calcular el preu del producte segons la data de caducitat o els dies de garantia, aquesta interficie ha sigut implementada a Electronica i també  a Alimentació.

7-Amb l'excepcio NegatiuException he fet una funcio per comprovar si un numero es negatiu, en cas de que ho sigui llença aquest tipus d'excepcio.

8-En cas de que el carro superi els 100 productes llença una exception de LimitProductesException creada per mi.
