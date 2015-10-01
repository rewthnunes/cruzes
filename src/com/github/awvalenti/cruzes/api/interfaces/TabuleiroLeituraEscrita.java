package com.github.awvalenti.cruzes.api.interfaces;

import com.github.awvalenti.cruzes.api.excecoes.MovimentoInvalidoException;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;

public interface TabuleiroLeituraEscrita extends TabuleiroLeitura {

	void fazerMovimento(Movimento m) throws PosicaoInvalidaException, MovimentoInvalidoException;

}
