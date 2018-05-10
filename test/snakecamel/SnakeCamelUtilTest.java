package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void ＿の入った文字列を区切り頭の文字を大文字にするテスト() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual= scu.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 大文字をさがして小文字と_をつけるテスト() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "aAb_cC";
		String actual= scu.camelToSnakecase("AbC");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 最初の小文字を大文字にするテスト() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc_def";
		String actual= scu.capitalize("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 最初の大文字を小文字にするテスト() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual= scu.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
	

}
