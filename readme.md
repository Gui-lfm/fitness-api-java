# Fitness API

## Sobre

<p align="justify">API para gerenciar exercícios físicos, usando o framework Spring boot.</p>


## ↗️ Endpoints
### workouts

```
/workouts
```

- Utilizando o método GET:
  - retorna uma lista com todos os exercícios presentes no banco de dados.

- Utilizando o método POST:
  - Recebe os dados de um novo exercício, presente no corpo da requisição.
  - Salva os dados do novo exercício no banco de dados.
  - Em caso de sucesso, retorna o novo objeto salvo no banco de dados.

```
/workouts/id
```

- Utiliza o método do tipo GET.
- Retorna os dados do exercício especificado pelo id presente no parâmetro da URL.