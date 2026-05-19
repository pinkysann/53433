import antlr4 from 'antlr4';
import fs from 'fs';

import MiniCLexer from './generated/MiniCLexer.js';
import MiniCParser from './generated/MiniCParser.js';

const input = fs.readFileSync('input.txt', 'utf8');

console.log("\nCódigo fuente leído:\n");
console.log(input);

const chars = new antlr4.InputStream(input);

const lexer = new MiniCLexer(chars);

const tokens = new antlr4.CommonTokenStream(lexer);

tokens.fill();

console.log("\nTabla de tokens:\n");

tokens.tokens.forEach(token => {
    if (token.type !== -1) {
        console.log(
            `Lexema: ${token.text} -> Token: ${MiniCLexer.symbolicNames[token.type]}`
        );
    }
});
const parser = new MiniCParser(tokens);

parser.buildParseTrees = true;

const tree = parser.program();

if (parser._syntaxErrors === 0) {
    console.log("\nEntrada válida.");

    console.log("\nÁrbol sintáctico:\n");

    console.log(tree.toStringTree(parser.ruleNames));
} else {
    console.log("\nLa entrada contiene errores sintácticos.");
}
