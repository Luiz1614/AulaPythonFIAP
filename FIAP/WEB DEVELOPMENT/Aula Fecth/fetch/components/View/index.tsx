import {Props} from './interface';

const View = (props: Props) => {
    return(
        <>
            <label>{props.id}</label>
            <label>{props.title}</label>
        </>
    );
    }

export default View;