package cl.zbsys.controller;

import cl.zbsys.domain.Parametros;
import cl.zbsys.domain.Resultado;
import cl.zbsys.exceptions.OperationException;
import cl.zbsys.services.OperatoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by josebovet on 12/22/15.
 */
@RestController
public class OperatoriaController {

    @Autowired
    OperatoriaService operatoriaService;


    @RequestMapping(value = "/suma", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity sumar(
            @Valid @RequestBody Parametros params, BindingResult bindingResult) throws OperationException {
        if (bindingResult.hasErrors()) {
            throw new OperationException("Invalid parameters");
        }
        int resultado = operatoriaService.suma(params.getA(), params.getB());
        return new ResponseEntity(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/resta", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity restar(
            @Valid @RequestBody Parametros params, BindingResult bindingResult) throws OperationException {
        if (bindingResult.hasErrors()) {
            throw new OperationException("Invalid parameters");
        }
        int resultado = operatoriaService.resta(params.getA(), params.getB());
        return new ResponseEntity(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/listarPrimos", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Integer>> listaPrimos() throws OperationException {
        List<Integer> lista = operatoriaService.generarPrimos();
        return new ResponseEntity<List<Integer>>(lista, HttpStatus.OK);
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Resultado>> listarResultados() throws OperationException {
        List<Resultado> resultados = operatoriaService.obtenerResultados();
        return new ResponseEntity<List<Resultado>>(resultados, HttpStatus.OK);
    }


}
