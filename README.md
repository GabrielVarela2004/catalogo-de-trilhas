# 🥾 Sistema de Catálogo de Trilhas Ecológicas

Sistema desenvolvido em **Java** para o gerenciamento de trilhas ecológicas, estruturado seguindo os princípios de **Arquitetura em Camadas (MVC / Service-Repository)** e utilizando armazenamento em memória com array de tamanho fixo.

## 🚀 Funcionalidades do Sistema

1. **Cadastro de Trilhas com Validações**:
   - Limite de armazenamento de até 5 trilhas (array de tamanho fixo).
   - Validação de dados obrigatórios (nome, localização, distância, duração e nível de dificuldade).
   - Prevenção contra cadastros duplicados baseados no nome da trilha.

2. **Listagem de Trilhas**:
   - Exibição detalhada de todas as trilhas cadastradas no sistema, ignorando posições vazias (`null`).

3. **Busca por Nome**:
   - Pesquisa interativa por nome da trilha (tratando maiúsculas e minúsculas).
   - Retorno completo dos dados da trilha encontrada com tratamento seguro para evitar erros de ponteiro nulo (`NullPointerException`).

4. **Interface de Terminal Interativa**:
   - Menu dinâmico utilizando a classe `Scanner` com tratamento adequado de buffer de leitura (`nextLine()` / `nextInt()` / `nextDouble()`).

---

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 17+)
- **Programação Orientada a Objetos (POO)**
- **Estrutura de Dados** (Arrays estáticos)
- **Arquitetura em Camadas**

---

## 📂 Estrutura do Projeto

```text
src/
├── apresentacao/
│   └── Main.java          # Fluxo de interação com o usuário via console (Menu)
├── dominio/
│   └── Trilha.java        # Entidade / Modelo de dados da Trilha
├── repositorio/
│   └── TrilhaRepositorio.java # Lógica de persistência em array e buscas brutas
└── servico/
    └── TrilhaServico.java     # Regras de negócio, validações e tratamento de dados
