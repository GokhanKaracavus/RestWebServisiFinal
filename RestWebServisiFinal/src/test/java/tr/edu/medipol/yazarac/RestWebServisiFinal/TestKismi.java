package tr.edu.medipol.yazarac.RestWebServisiFinal;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ogrenci")
public class TestKismi {
	// Kişilerin Kontrol Testi

	@Test
	public void ListeKontrol() {
		// Given - Koşullar - Ön Şartlar
		List<String> ogrenciler = new ArrayList<>();
		{
			String ogrenci1 = "Gokhan";
			String ogrenci2 = "Kemal";
			String ogrenci3 = "Simge";
			String ogrenci4 = "Selin";

			int Not = 21;
			int Not2 = 22;
			int Not3 = 20;
			int Not4 = 24;

			// When
			ogrenciler.add(ogrenci1 + Not);
			ogrenciler.add(ogrenci2 + Not2);
			ogrenciler.add(ogrenci3 + Not3);
			ogrenciler.add(ogrenci4 + Not4);

			// Then - Kontrol
			assertEquals("Gokhan", ogrenci1);
			assertEquals("Kemal", ogrenci2);
			assertEquals("Simge", ogrenci3);
			assertEquals("Selin", ogrenci3);

		}

	}

	private void assertEquals(String string, String ogrenci1) {
		// TODO Auto-generated method stub

	}

	@GetMapping("/ogrenciEkle/{ogrenciAdi}")
	@Test
// Ogrenci Ekleme Testi
// Given
	public void OgrenciEkle() {
		List<String> ogrenciler = new ArrayList<>();
		{
			String student1 = "Gokhan";
			String student2  = "Kemal";
			String student3 = "Simge";
			String student4 = "Selin";
		}

		// When
		String yeniogrenci = "Gokhan";
		ogrenciler.add(yeniogrenci);

		// Then
		assertEquals(yeniogrenci, "Gokhan");

	}

	@GetMapping("/ogrenciSil/{ogrenciAdi}")
	@Test
	public void OgrenciSil() {

		// OgrenciSil Test Kismi

		// Given
		List<String> ogrenciler = new ArrayList<>();
		{
			String student1 = "Gokhan";
			String student2 = "Kemal";
			String student3 = "Simge";
			String student4 = "Selin";

			// When

			ogrenciler.remove(student3);

			// Then
			assertEquals(student3, "Simge");
		}

	}

}