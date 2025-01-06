package desafios

data class Produto(
    val id: Int?,
    val nome: String,
    val preco: Double,
    val quantidade: Int
)

interface Estoque<T> {
    fun inserir(item: T)
    fun deletar(id: Int) : Boolean
    fun atualizar(item: T) : Boolean
    fun buscar(id: Int) : T
    fun buscarTodos() : List<T>
}

class EstoqueDeProdutos: Estoque<Produto> {
    private val listaProdutos = mutableListOf<Produto>()

    override fun inserir(item: Produto) {
        listaProdutos.add(item)
    }

    override fun deletar(id: Int): Boolean {
        return listaProdutos.removeIf { it.id == id }
    }

    override fun atualizar(item: Produto): Boolean {
        if (listaProdutos.removeIf { it.id == item.id }){
            listaProdutos.add(item)
            return true
        } else {
            return false
        }
    }

    override fun buscar(id: Int): Produto {
        return listaProdutos.find { it.id == id } ?: throw Exception("Produto não encontrado")
    }

    override fun buscarTodos(): List<Produto> {
        return listaProdutos.toList()
    }

}

fun preencherProduto(): Produto {
    var id: Int? = null
    while (id == null){
        println("Informe o ID do produto: ")
        print("-> ")
        id = readlnOrNull()?.toIntOrNull()
        if (id == null){
            println("ID informado é inválido. Tente novamente.")
        }
    }

    var nome: String? = null
    while (nome == null){
        println("Informe o NOME do produto: ")
        print("-> ")
        nome = readlnOrNull()
        if (nome == null){
            println("NOME informado é inválido. Tente novamente.")
        }
    }

    var preco: Double? = null
    while (preco == null){
        println("Informe o PREÇO do produto: ")
        print("-> ")
        preco = readlnOrNull()?.toDoubleOrNull()
        if (preco == null){
            println("PREÇO informado é inválido. Tente novamente.")
        }
    }

    var quantidade: Int? = null
    while (quantidade == null){
        println("Informe a QUANTIDADE do produto: ")
        print("-> ")
        quantidade = readlnOrNull()?.toIntOrNull()
        if (quantidade == null){
            println("QUANTIDADE informada é inválida. Tente novamente.")
        }
    }

    return Produto(
        id = id,
        nome = nome,
        preco = preco,
        quantidade = quantidade
    )
}

fun preencherProdutoAtualizado(produtoASerAtualizado: Produto): Produto {
    var nome: String? = null
    while (nome == null){
        println("Altere o NOME do produto (caso não queira alterar, pressione ENTER): ")
        print("-> ")
        nome = readlnOrNull()?.ifEmpty { produtoASerAtualizado.nome }
        if (nome == null){
            println("NOME informado é inválido. Tente novamente.")
        }
    }

    var preco: Double? = null
    while (preco == null){
        println("Altere o PREÇO do produto (caso não queira alterar, pressione ENTER): ")
        print("-> ")
        preco = readlnOrNull()?.ifEmpty { produtoASerAtualizado.preco.toString() }?.toDoubleOrNull()
        if (preco == null){
            println("PREÇO informado é inválido. Tente novamente.")
        }
    }

    var quantidade: Int? = null
    while (quantidade == null){
        println("Altere a QUANTIDADE do produto (caso não queira alterar, pressione ENTER): ")
        print("-> ")
        quantidade = readlnOrNull()?.ifEmpty { produtoASerAtualizado.quantidade.toString() }?.toIntOrNull()
        if (quantidade == null){
            println("QUANTIDADE informada é inválida. Tente novamente.")
        }
    }

    return Produto(
        id = produtoASerAtualizado.id,
        nome = nome,
        preco = preco,
        quantidade = quantidade
    )
}

fun main() {
    val estoqueDeProdutos = EstoqueDeProdutos()

    var acao: Int? = null

    while (acao != 5){
        // https://tableconvert.com/ascii-generator
        println(
            """
        +---------------------------------+
        |  CONTROLE DE ESTOQUE - PRODUTOS |
        +---------------------------------+
        |  1 - Adicionar                  |
        |  2 - Atualizar                  |
        |  3 - Deletar                    |
        |  4 - Buscar                     |
        |  5 - Sair                       |
        +---------------------------------+
        """
        )
        println("LISTA ATUAL DE PRODUTOS EM ESTOQUE: ")
        println(
            estoqueDeProdutos.buscarTodos().joinToString(
                separator = "\n",
            ).ifEmpty { "Nenhum produto foi adicionado ao estoque até o momento." }
        )
        print("-> ")
        acao = readlnOrNull()?.toIntOrNull()

        when (acao) {
            1 -> {
                val produto = preencherProduto()
                estoqueDeProdutos.inserir(item = produto)
                println("Produto adicionado com sucesso!")
            }
            2 -> {
                var id: Int? = null
                while (id == null){
                    println("Informe o ID do produto a ser atualizado: ")
                    print("-> ")
                    id = readlnOrNull()?.toIntOrNull()
                    if (id == null || estoqueDeProdutos.buscar(id = id) == null){
                        println("ID informado é inválido. Tente novamente.")
                    }
                }
                val produtoASerAtualizado = estoqueDeProdutos.buscar(id = id)
                produtoASerAtualizado?.let {
                    val produtoAtualizado = preencherProdutoAtualizado(produtoASerAtualizado = it)
                    estoqueDeProdutos.atualizar(item = produtoAtualizado)
                    println("Produto atualizado com sucesso!")
                }
            }
            3 -> {
                var id: Int? = null
                while (id == null){
                    println("Informe o ID do produto: ")
                    print("-> ")
                    id = readlnOrNull()?.toIntOrNull()
                    if (id == null){
                        println("ID informado é inválido. Tente novamente.");
                    }
                }
            }
            4 -> {

            }
            5 -> {
                println("Obrigado, volte sempre!")
            }
            else -> {
                println("Opção escolhida é inválida. Tente novamente.")
            }
        }
    }


}