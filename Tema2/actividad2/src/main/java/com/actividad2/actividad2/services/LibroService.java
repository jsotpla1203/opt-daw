package com.actividad2.actividad2.services;

import com.actividad2.actividad2.dtos.*;
import com.actividad2.actividad2.models.Libro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class LibroService {
    private List<Libro> libros = new ArrayList<>();
    private Random random = new Random();


    public ResponseEntity<?> crearLibro(CrearLibroDto libroDto){
        for (Libro libro : libros){
            if (libro.getIsbn().equalsIgnoreCase(libroDto.getIsbn())){
                return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorDto("ISBN Duplicado"));
            }
        }
        Long idAleatorio = random.nextLong(1, 100);

        Libro nuevo = new Libro(
                idAleatorio,
                libroDto.getTitulo(),
                libroDto.getAutor(),
                libroDto.getIsbn(),
                libroDto.getAnioPublicacion()
        );

        libros.add(nuevo);

        RespuestaDto respuestaDto = new RespuestaDto(
                nuevo.getId(),
                nuevo.getTitulo(),
                nuevo.getAutor(),
                nuevo.getIsbn(),
                nuevo.getAnioPublicacion(),
                nuevo.isPrestado()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(respuestaDto);
    }

    public ResponseEntity<?> listarLibros(){
        List<LibroReducidoDto> listaReducida = new ArrayList<>();

        for (Libro libro : libros){
            LibroReducidoDto dto = new LibroReducidoDto(libro.getId(), libro.getTitulo());
            listaReducida.add(dto);
        }

        return ResponseEntity.status(HttpStatus.OK).body(listaReducida);
    }

    public ResponseEntity<?> buscarLibro(Long id){
        for (Libro libro : libros){
            if (libro.getId().equals(id)){

                RespuestaDto respuesta = new RespuestaDto(
                        libro.getId(),
                        libro.getTitulo(),
                        libro.getAutor(),
                        libro.getIsbn(),
                        libro.getAnioPublicacion(),
                        libro.isPrestado()
                );

                return ResponseEntity.status(HttpStatus.OK).body(respuesta);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto("El libro no existe"));
    }

    public ResponseEntity<?> prestarLibro(Long id){
        for (Libro libro : libros) {
            if (libro.getId().equals(id)) {
                if (!libro.prestar()){
                    return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorDto("El libro esta prestado"));
                }

                RespuestaDto respuesta = new RespuestaDto(
                        libro.getId(),
                        libro.getTitulo(),
                        libro.getAutor(),
                        libro.getIsbn(),
                        libro.getAnioPublicacion(),
                        libro.isPrestado()
                );

                return ResponseEntity.status(HttpStatus.OK).body(respuesta);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto("El libr no existe"));
    }

    public ResponseEntity<?> devolverLibro(Long id){
        for (Libro libro : libros) {
            if (libro.getId().equals(id)) {
                if (!libro.devolver()){
                    return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorDto("El libro no esta prestado"));
                }

                RespuestaDto respuesta = new RespuestaDto(
                        libro.getId(),
                        libro.getTitulo(),
                        libro.getAutor(),
                        libro.getIsbn(),
                        libro.getAnioPublicacion(),
                        libro.isPrestado()
                );

                return ResponseEntity.status(HttpStatus.OK).body(respuesta);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto("El libr no existe"));
    }
}