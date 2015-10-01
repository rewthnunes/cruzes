package com.github.awvalenti.cruzes.api.interfaces;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;

public interface TabuleiroLeitura {

	int getNumeroLinhas();

	int getNumeroColunas();

	CorCasa getCorDaCasa(Posicao p) throws PosicaoInvalidaException;

	ConteudoCasa getConteudoDaCasa(Posicao p) throws PosicaoInvalidaException;

	Time getVezDeQuem();

}
