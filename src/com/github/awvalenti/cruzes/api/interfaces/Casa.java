package com.github.awvalenti.cruzes.api.interfaces;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;

public interface Casa {

	CorCasa getCor();

	ConteudoCasa getConteudo();

	void setConteudo(ConteudoCasa conteudo);

}
