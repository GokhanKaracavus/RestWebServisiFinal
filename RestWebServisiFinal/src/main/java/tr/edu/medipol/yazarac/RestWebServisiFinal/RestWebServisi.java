package tr.edu.medipol.yazarac.RestWebServisiFinal;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/ogrenci")
public class RestWebServisi {

	 private static List<Ogrenci> ogrenciListesi = new ArrayList<>();
	    static {
	        ogrenciListesi.add(new Ogrenci("Gokhan", 21));
	        ogrenciListesi.add(new Ogrenci("Kemal", 22));
	        ogrenciListesi.add(new Ogrenci("Simge", 20));
	        ogrenciListesi.add(new Ogrenci("Selin", 24));
	    }
	    // http://localhost:8080/ogrenci/listele
	    @GetMapping("/listele")
	    public List<Ogrenci> listele(){
	        return ogrenciListesi;
	    }
	    @PostMapping("/ekle")
	    public Ogrenci Ekle(@RequestBody Ogrenci ogrenci){
	    	ogrenciListesi.add(ogrenci);
			return ogrenci;
	    }
	    @PostMapping("/ogrencisil")
	    public  Ogrenci sil(@RequestBody Ogrenci ogrenci){
	        ogrenciListesi.add(ogrenci);
	        return ogrenci;
	    }
	}