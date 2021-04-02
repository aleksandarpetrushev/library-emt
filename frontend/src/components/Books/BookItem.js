import React from 'react';
import { Link } from 'react-router-dom';

const BookItem = (props) => {
  return (
    <tr>
      <td>{props.book.name}</td>
      <td>{props.book.category}</td>
      <td>{props.book.author.name + ' ' + props.book.author.surname}</td>
      <td>{props.book.availableCopies}</td>
      <td className={"text-right"}>
        <a title={"Delete"} className={"btn btn-danger"}
          onClick={() => props.onDelete(props.book.id)}>
          Delete
        </a>
        <Link className={"btn btn-info ml-2"}
          onClick={() => props.onEdit(props.book.id)}
          to={`/books/${props.book.id}/edit`}>
          Edit
        </Link>
      </td>
    </tr>
  )
}

export default BookItem;
