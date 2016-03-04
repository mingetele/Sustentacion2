package sustentacion2;

import java.util.Scanner;

public class Sustentacion2 {

    public static void main(String[] args) {

        Libros libro[] = new Libros[50];
        Persona usuario[] = new Persona[50];

        Scanner lector = new Scanner(System.in);
        int opc = 0, contLib = 0, prestLib = 0, busqueda = 0, conCed = 0;
        String name;

        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Gestion de Libros");
            System.out.println("2. Gestion de Prestamos");
            System.out.println("3. Salir");
            System.out.println("Por favor Seleccione una opcion\n");
            opc = lector.nextInt();
            switch (opc) {

                case 1:

                    do {

                        System.out.println("\nGESTION DE LIBROS");
                        System.out.println("1. Ingresar Libros");
                        System.out.println("2. Actualizar Libros");
                        System.out.println("3. Eliminar Libros");
                        System.out.println("4. Buscar Libro");
                        System.out.println("5. Salir");
                        System.out.println("Por favor Seleccione una opcion\n");
                        opc = lector.nextInt();

                        switch (opc) {
                            case 1:
                                if (contLib < 49) {
                                    libro[contLib] = new Libros();

                                    System.out.print("Digite el Nombre o Titulo del libro: ");
                                    libro[contLib].setTitulo(lector.next());
                                    System.out.print("Digite el Nombre del Autor del libro: ");
                                    libro[contLib].setAutor(lector.next());
                                    System.out.print("Digite el año de publicacion del libro: ");
                                    libro[contLib].setYearPublic(lector.next());
                                    System.out.print("Digite el codigo del libro: ");
                                    libro[contLib].setCodigo(lector.next());
                                    System.out.print("Digite la cantidad de libros a ingresar: ");
                                    libro[contLib].setCantidad(lector.next());
                                    System.out.print("Digite el area a la cual pertenece el libro; Quimica, Fisica, Tecnologia, Calculo o Programacion: ");
                                    libro[contLib].setArea(lector.next());
                                    contLib++;

                                } else {
                                    System.out.println("BASE DE DATOS LLENA ");
                                }
                                break;

                            case 2:
                                System.out.println("ACTUALIZAR LIBROS\n");
                                System.out.println("Digite el Titulo del libro que quiere actualizar: ");
                                name = lector.next();
                                for (int i = 0; i < contLib; i++) {
                                    if (name.equals(libro[i].getTitulo())) {
                                        busqueda = 1;

                                        System.out.print("Actualice el Nombre del Autor del libro: ");
                                        libro[i].setAutor(lector.next());
                                        System.out.print("Actualice el año de publicacion del libro: ");
                                        libro[i].setYearPublic(lector.next());
                                        System.out.print("Actualice el codigo del libro: ");
                                        libro[i].setCodigo(lector.next());
                                        System.out.print("Actualice la cantidad de libros a ingresar: ");
                                        libro[i].setCantidad(lector.next());
                                        System.out.print("Actualice el area a la cual pertenece el libro; Quimica, Fisica, Tecnologia, Calculo o Programacion: ");
                                        libro[i].setArea(lector.next());

                                    }
                                }
                                if (busqueda == 0) {
                                    System.out.println("LIBRO NO ENCONTRADO");
                                } else {
                                    busqueda = 0;
                                }
                                break;

                            case 3:
                                System.out.println("ELIMINAR LIBRO\n");
                                System.out.println("Digite el Titulo del libro que desea eliminar: ");
                                name = lector.next();
                                for (int i = 0; i < contLib; i++) {
                                    if (name.equals(libro[i].getTitulo())) {
                                        busqueda = 1;

                                        contLib--;

                                        System.out.println("EL LIBRO " + name + " HA SIDO BORRADO EXITOSAMENTE.");

                                    }
                                }
                                if (busqueda == 0) {
                                    System.out.println("LIBRO NO ENCONTRADO");
                                } else {
                                    busqueda = 0;
                                }

                                break;

                            case 4:
                                System.out.println("BUSCAR LIBRO\n");
                                System.out.println("Digite el nombre que desea buscar: ");
                                name = lector.next();
                                for (int i = 0; i < contLib; i++) {
                                    if (name.equals(libro[i].getTitulo())) {
                                        busqueda = 1;

                                        System.out.println("Titulo: " + libro[i].getTitulo());
                                        System.out.println("Autor: " + libro[i].getAutor());
                                        System.out.println("Año de Publicacion: " + libro[i].getYearPublic());
                                        System.out.println("Codigo: " + libro[i].getCodigo());
                                        System.out.println("Cantidad: " + libro[i].getCantidad());
                                        System.out.println("Area: " + libro[i].getArea());

                                    }
                                }
                                if (busqueda == 0) {
                                    System.out.println("EL LIBRO NO SE ENCUENTRA EN LA BASE DE DATOS");
                                } else {
                                    busqueda = 0;
                                }

                                break;

                            case 5:
                                System.out.println("");
                                break;

                            default:
                                System.out.println("POR FAVOR INGRESE UNA OPCION VALIDA \n");
                                break;

                        }

                    } while (opc != 5);

                    break;

                case 2:

                    if (conCed < 49) {
                        usuario[conCed] = new Persona();

                        System.out.println("\nGESTION DE PRESTAMOS");
                        System.out.println("Digite el numero de Cedula del usuario:");
                        usuario[conCed].setCedula(lector.next());
                        conCed++;
                    } else {
                        System.out.println("BASE DE DATOS LLENA ");
                    }

                    do {

                        System.out.println("\nQUE DESEA HACER:");
                        System.out.println("1. Prestar Libros");
                        System.out.println("2. Devolver Libros");
                        System.out.println("3. Consultar Libros Prestados");
                        System.out.println("4. SALIR");
                        System.out.println("Por favor Seleccione una opcion\n");
                        opc = lector.nextInt();

                        switch (opc) {

                            case 1:
                                System.out.println("PRESTAR LIBROS\n");
                                System.out.println("Digite el Titulo del libro que desea Prestar: ");
                                name = lector.next();

                                for (int i = 0; i < contLib; i++) {
                                    if (name.equals(libro[i].getTitulo())) {
                                        busqueda = 1;

                                        contLib--;
                                        prestLib++;

                                        System.out.println("EL LIBRO " + name + " HA SIDO PRESTADO.");

                                    }
                                }

                                if (busqueda == 0) {
                                    System.out.println("LIBRO NO ENCONTRADO");
                                } else {
                                    busqueda = 0;

                                }

                                break;

                            case 2:
                                System.out.println("DEVOLVER LIBROS\n");
                                System.out.println("Digite el Titulo del libro que desea Devolver: ");
                                name = lector.next();

                                for (int i = 0; i < prestLib; i++) {
                                    if (name.equals(libro[i].getTitulo())) {
                                        busqueda = 1;

                                        prestLib--;
                                        contLib++;

                                        System.out.println("EL LIBRO " + name + " HA SIDO DEVUELTO.");

                                    }
                                }

                                if (busqueda == 0) {
                                    System.out.println("LIBRO NO ENCONTRADO");
                                } else {
                                    busqueda = 0;

                                }

                                break;

                            case 3:
                                System.out.println("LIBROS PRESTADOS: " + prestLib);

                                break;

                            default:
                                System.out.println("POR FAVOR INGRESE UNA OPCION VALIDA \n");
                                break;
                                
                            case 4:
                                System.out.println("");
                                break;

                        }

                    } while (opc != 4);

                    break;
                    
                case 3:
                    System.out.println("GRACIAS POR UTILIZAR ESTE PROGRAMA");
                    break;

                default:
                    System.out.println("POR FAVOR INGRESE UNA OPCION VALIDA \n");
                    break;

            }

        } while (opc != 3);
        

    }

}
