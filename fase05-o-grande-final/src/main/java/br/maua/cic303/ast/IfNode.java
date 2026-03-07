// IfNode.java
package br.maua.cic303.ast;
import br.maua.cic303.Environment;

public class IfNode extends ASTNode {
    public final ASTNode condicao, blocoVerdadeiro, blocoFalso;
    public IfNode(ASTNode c, ASTNode b1, ASTNode b2) { condicao = c; blocoVerdadeiro = b1; blocoFalso = b2; }
    
    @Override 
    public Double avaliar(Environment env) {
        // Se a condição for diferente de 0.0 (True)
        if (condicao.avaliar(env) != 0.0) {
            return blocoVerdadeiro.avaliar(env);
        } else if (blocoFalso != null) {
            return blocoFalso.avaliar(env);
        }
        return 0.0;
    }
}

