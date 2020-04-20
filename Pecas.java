package trabalho2;
public class Pecas {
    int emjogo;
	//se emjogo = 0, a pe�a representa uma casa vazia
	//se emjogo = 1, a pe�a est� em jogo e � branca
	//se emjogo = 2, a pe�a est� em jogo e � preta
	//se emjogo = 3, a pe�a � uma dama branca
	//se emjogo = 4, a pe�a � uma dama branca
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void tirarpeca(Pecas p){
        p.emjogo = 0;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    String checar(){
        if(this.emjogo == 0){
            return "-";
        }
        if(this.emjogo == 1){
            return "b";
        }
        if(this.emjogo == 2){
            return "p";
        }
        if(this.emjogo == 3){
            return "B";
        }
        if(this.emjogo == 4){
            return "P";
        }
        return "@";
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void CheckDama(Tabuleiro t, int l2, int c2) {
    	if(l2 == 7) {
    		if(t.p[l2][c2].emjogo == 1) {
    			t.p[l2][c2] = new PecaDama(3);
    		}
    	}
    	if(l2 == 0) {
    		if(t.p[l2][c2].emjogo == 2) {
    			t.p[l2][c2] = new PecaDama(4);
    		}
    	}
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}