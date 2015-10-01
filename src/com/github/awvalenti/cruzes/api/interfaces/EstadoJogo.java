package com.github.awvalenti.cruzes.api.interfaces;

import com.github.awvalenti.cruzes.api.enums.Time;

public interface EstadoJogo {

	boolean isFinalizado();

	Time getTimeVencedor();

}
