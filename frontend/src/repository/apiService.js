import axios from '../custom-axios/axios';

const apiService = {
  fetchBooks: () => {
    return axios.get('/books');
  },

  deleteBook: (id) => {
    return axios.delete(`/books/${id}`);
  },

  fetchAuthors: () => {
    return axios.get('/authors');
  },

  addBook: (name, category, availableCopies, author) => {
    return axios.post('/books', {
      "name": name,
      "category": category,
      "availableCopies": availableCopies,
      "author": author
    });
  },

  getBook: (id) => {
    return axios.get(`/books/${id}`);
  },

  editProduct: (id, name, category, availableCopies, author) => {
    return axios.put(`/books/${id}`, {
      "name": name,
      "category": category,
      "availableCopies": availableCopies,
      "author": author
    });
  }
}

export default apiService;