// WhileNode.java
package br.maua.cic303.ast;

import br.maua.cic303.Environment;

public class WhileNode extends ASTNode {
    public final ASTNode condicao, bloco;

    public WhileNode(ASTNode c, ASTNode b) {
        condicao = c;
        bloco = b;
    }

    @Override
    public Double avaliar(Environment env) {
        while (condicao.avaliar(env) != 0.0) {
            bloco.avaliar(env);
        }
        return 0.0;
    }
}