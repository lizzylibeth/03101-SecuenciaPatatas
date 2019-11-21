/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {

        //Constantes
        final String PERSONA_ENCARGADA = "Jaimito";
        final String ARTICULO_ENCARGADO = "Patatas";
        final int CANTIDAD_ENCARGADA = 3;
        final double PRECIO_ENCARGADO = 0.30;
        final double DINERO_SUMINISTRADO = 1.00;
        final String ARTICULO_IMPREVISTO = "Piruleta";
        final double PRECIO_IMPREVISTO = 0.20;

        //Variables
        double dineroRestante = DINERO_SUMINISTRADO - PRECIO_IMPREVISTO;
        int numeroKilos = (int) (dineroRestante / PRECIO_ENCARGADO);
        double dineroDevuelto = DINERO_SUMINISTRADO - dineroRestante;

        //Cabecera
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");

        System.out.printf("Persona encargada .....: %s %n", PERSONA_ENCARGADA);
        System.out.printf("Artículo encargado ....: %s %n", ARTICULO_ENCARGADO);
        System.out.printf("Cantidad encargada ....: %d kg %n", CANTIDAD_ENCARGADA);

        //Separar
        System.out.println("---");

        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.2f €/kg %n",
                PRECIO_ENCARGADO);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado ...: %.2f €%n",
                DINERO_SUMINISTRADO);

        //Separar
        System.out.println("---");

        System.out.printf("Artículo imprevisto ...: %s%n", ARTICULO_IMPREVISTO);
        System.out.printf(Locale.ENGLISH, "Precio imprevisto .....: %.2f € %n",
                PRECIO_IMPREVISTO);

        //Separar
        System.out.println("---");

        System.out.printf("Cantidad comprada .....: %d kg%n", numeroKilos);
        System.out.printf(Locale.ENGLISH, "Dinero devuelto .......: %.2f €%n",
                dineroDevuelto);

    }//main

}//class
