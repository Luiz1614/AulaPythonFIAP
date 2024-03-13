interface Props {
    text: string;
    alt: string;
}


const Button = (props: Props) => {
  return <button className="bg-gray-500 my-4 px-6 py-2 border-solid text-white " title={props.alt}>{props.text}</button>;
};

export default Button;